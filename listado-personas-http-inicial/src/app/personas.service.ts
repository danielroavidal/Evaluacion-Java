import { Persona } from './persona.model';
import { LoggingService } from './LoggingService.service';
import { Injectable, EventEmitter } from '@angular/core';

@Injectable()
export class PersonasService{
    personas: Persona[] = [
        new Persona("Juan","Perez"),
        new Persona("Laura","Juarez")
    ];

    saludar = new EventEmitter<number>();
  loginService: any;

    constructor(private loggingService: LoggingService){

      cargarPersonas(){
        const token = this.loginService.getIdToken();
        return thiis.httpClinet.get('https://listado-personas.postgres.com/datos.json?auth=' + token + PersonasService);
      }

    }

    agregarPersona(persona: Persona){
        const token = this.loginService.getIdToken();
        this.loggingService.enviaMensajeAConsola("agregamos persona:" + persona.nombre);
        this.personas.push(persona);
    }

    encontrarPersona(index: number){
        const token = this.loginService.getIdToken();
        let persona: Persona = this.personas[index];
        return persona;
    }

    modificarPersona(index:number, persona:Persona){
        const token = this.loginService.getIdToken();
        let persona1 = this.personas[index];
        persona1.nombre = persona.nombre;
        persona1.correo = persona.correo;
        persona1.contraseña = persona.contraseña;
    }

    eliminarPersona(index:number){
      const token = this.loginService.getIdToken();
        this.personas.splice(index,1);
    }
}
