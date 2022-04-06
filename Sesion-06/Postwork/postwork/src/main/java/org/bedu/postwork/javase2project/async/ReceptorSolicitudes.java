package org.bedu.postwork.javase2project.async;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class ReceptorSolicitudes implements Runnable{

    private boolean enEjecucion = false;
    private Queue<SolicitudEstudiante> solicitudesPendientes = new LinkedList<>();
    private final NotificadorInscripcion worker;

    public ReceptorSolicitudes(NotificadorInscripcion worker) {
        this.worker = worker;
    }

    @Override
    public void run() {
        try{
            while(enEjecucion || !solicitudesPendientes.isEmpty()){
                SolicitudEstudiante solicitud = solicitudesPendientes.poll();

                if(solicitud == null){
                    System.out.println("Esperando solicitudes nuevas...");
                    TimeUnit.SECONDS.sleep(1);
                    continue;
                }
                worker.notificarMaestro(solicitud);
                TimeUnit.MILLISECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void iniciar(){
        this.enEjecucion = true;
        new Thread(this).start();
    }

    public void detener(){
        this.enEjecucion = false;
    }

    public void registrarEvento(SolicitudEstudiante evento){
        solicitudesPendientes.add(evento);
    }

    public boolean isEnEjecucion(){
        return enEjecucion;
    }
}
