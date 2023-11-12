package modelo;

public class Worker implements Runnable{
        private final int limite; // Límite de números a imprimir
        private final int resto; // Resto usado para distinguir números pares e impares
        static Object lock = new Object(); // Objeto compartido para sincronización
        static volatile int numero = 1; // Número inicial para imprimir

        public Worker(int limite, int resto) {
            this.limite = limite;
            this.resto = resto;
        }

        // Lógica de ejecución del hilo
        @Override
        public void run() {
            while (true) {
                synchronized (lock) { // Bloque sincronizado para asegurar la exclusión mutua
                    while (numero % 2 != resto) { // Verifica si es el turno de este hilo
                        try {
                            lock.wait(); // Espera hasta que sea su turno
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (numero > limite) { // Si se alcanza el límite, se detiene
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + numero); // Imprime el número
                    numero++; // Incrementa el número para el siguiente hilo
                    lock.notifyAll(); // Notifica a todos los hilos que hay un cambio
                }
            }
        }
}
