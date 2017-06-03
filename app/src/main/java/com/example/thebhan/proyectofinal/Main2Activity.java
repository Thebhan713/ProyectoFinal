package com.example.thebhan.proyectofinal;

import android.content.Intent;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner sp_uniremington, sp_sedes, sp_programas, sp_admisiones, sp_plataformas, sp_bienestaryegresados, sp_comunidad, sp_ubicaicon;

    ArrayAdapter<String> adapter,adapter2,adapter3,adapter4,adapter5,adapter6,adapter7,adapter8;
    String [] lista_uniremington=new String[]{"Uniremington","Mision y Vision","Valores Institucionales","Lineamientos Academicos","Calendario Academico", "Reglamento Estudiantil", "Directorio Administrativo","¿Donde Estamos?"};
    String [] lista_sedes =new String []{"Sedes","Armenia","Boyaca","Bucaramanga","Cucuta","Medellin","Monteria","Pasto","Pereira","Sincelejo","Yopal"};
    String [] lista_programas =new String []{"Programas","Especializaciones","Pregrados","Tecnologias","Extension","Grupos de Estudio"};
    String [] lista_admisiones =new String []{"Admisiones","Pre-Inscripcion","Requisitos de Inscripcion","Homologaciones","Formas de Pago","Convenios y Descuentos"};
    String [] lista_plataformas =new String []{"Plataformas","Moodle","Q10","Recibo de Matricula","Documentos Nuevos","Reserva de Equipos","Biblioteca Uniremington","Modulo de Atencion PQRS"};
    String [] lista_bienestaryegresados =new String []{"Bienestar y Egresados","Internacionalizacion","Convenios y Descuentos"};
    String [] lista_comunidad =new String []{"Comunidad","Calendario - Eventos","Encuestas"};
    String [] lista_Ubicacion =new String []{"Ubicacion","Sede Centro","Sede Cable"};

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sp_uniremington= (Spinner)findViewById(R.id.spinner);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lista_uniremington);
        sp_uniremington.setAdapter(adapter);
        sp_uniremington.setOnItemSelectedListener(this);

        sp_sedes= (Spinner)findViewById(R.id.spinner3);
        adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lista_sedes);
        sp_sedes.setAdapter(adapter2);
        sp_sedes.setOnItemSelectedListener(this);

        sp_programas= (Spinner)findViewById(R.id.spinner4);
        adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,lista_programas);
        sp_programas.setAdapter(adapter3);
        sp_programas.setOnItemSelectedListener(this);

        sp_admisiones= (Spinner)findViewById(R.id.spinner5);
        adapter4 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lista_admisiones);
        sp_admisiones.setAdapter(adapter4);
        sp_admisiones.setOnItemSelectedListener(this);

        sp_plataformas= (Spinner)findViewById(R.id.spinner6);
        adapter5 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lista_plataformas);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_plataformas.setAdapter(adapter5);
        sp_plataformas.setOnItemSelectedListener(this);

        sp_bienestaryegresados= (Spinner)findViewById(R.id.spinner7);
        adapter6 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lista_bienestaryegresados);
        sp_bienestaryegresados.setAdapter(adapter6);
        sp_bienestaryegresados.setOnItemSelectedListener(this);

        sp_comunidad= (Spinner)findViewById(R.id.spinner8);
        adapter7 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lista_comunidad);
        sp_comunidad.setAdapter(adapter7);
        sp_comunidad.setOnItemSelectedListener(this);

        sp_ubicaicon= (Spinner)findViewById(R.id.spinner2);
        adapter8 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lista_Ubicacion);
        sp_ubicaicon.setAdapter(adapter8);
        sp_ubicaicon.setOnItemSelectedListener(this);
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

       switch (parent.getId()){
           case R.id.spinner:
                   int seleccionado=sp_uniremington.getSelectedItemPosition();
                      if(seleccionado==1){
                      this.intent = new Intent(this, Main3Activity.class);
                      startActivity(intent);}

                      if(seleccionado==2){
                      this.intent = new Intent(this, Main4Activity.class);
                      startActivity(intent);}

                      if(seleccionado==3){
                      this.intent = new Intent(this, Main5Activity.class);
                      startActivity(intent);}

                      if(seleccionado==4){
                      this.intent = new Intent(this, Main6Activity.class);
                      startActivity(intent);}

                      if(seleccionado==5){
                      this.intent = new Intent(this, Main7Activity.class);
                      startActivity(intent);}

                      if(seleccionado==6){
                      this.intent = new Intent(this, Main8Activity.class);
                      startActivity(intent);}

                      if(seleccionado==7){
                      this.intent = new Intent(this, Main9Activity.class);
                      startActivity(intent);}

        }


        switch (parent.getId()){
            case R.id.spinner3:
                int seleccionado=sp_sedes.getSelectedItemPosition();
                if(seleccionado==1){
                    this.intent = new Intent(this, Main41Activity.class);
                    startActivity(intent);}

                if(seleccionado==2){
                    this.intent = new Intent(this, Main10Activity.class);
                    startActivity(intent);}

                if(seleccionado==3){
                    this.intent = new Intent(this, Main11Activity.class);
                    startActivity(intent);}

                if(seleccionado==4){
                    this.intent = new Intent(this, Main12Activity.class);
                    startActivity(intent);}

                if(seleccionado==5){
                    this.intent = new Intent(this, Main13Activity.class);
                    startActivity(intent);}

                if(seleccionado==6){
                    this.intent = new Intent(this, Main14Activity.class);
                    startActivity(intent);}

                if(seleccionado==7){
                    this.intent = new Intent(this, Main15Activity.class);
                    startActivity(intent);}

                if(seleccionado==8){
                    this.intent = new Intent(this, Main16Activity.class);
                    startActivity(intent);}

                if(seleccionado==9){
                    this.intent = new Intent(this, Main17Activity.class);
                    startActivity(intent);}

                if(seleccionado==10){
                    this.intent = new Intent(this, Main18Activity.class);
                    startActivity(intent);}

        }

        switch (parent.getId()){
            case R.id.spinner4:
                int seleccionado=sp_programas.getSelectedItemPosition();
                if(seleccionado==1){
                    this.intent = new Intent(this, Main19Activity.class);
                    startActivity(intent);}

                if(seleccionado==2){
                    this.intent = new Intent(this, Main20Activity.class);
                    startActivity(intent);}

                if(seleccionado==3){
                    this.intent = new Intent(this, Main21Activity.class);
                    startActivity(intent);}

                if(seleccionado==4){
                    this.intent = new Intent(this, Main22Activity.class);
                    startActivity(intent);}

                if(seleccionado==5){
                    this.intent = new Intent(this, Main23Activity.class);
                    startActivity(intent);}


        }

        switch (parent.getId()){
            case R.id.spinner5:
                int seleccionado=sp_admisiones.getSelectedItemPosition();
                if(seleccionado==1){
                    this.intent = new Intent(this, Main24Activity.class);
                    startActivity(intent);}

                if(seleccionado==2){
                    this.intent = new Intent(this, Main25Activity.class);
                    startActivity(intent);}

                if(seleccionado==3){
                    this.intent = new Intent(this, Main26Activity.class);
                    startActivity(intent);}

                if(seleccionado==4){
                    this.intent = new Intent(this, Main27Activity.class);
                    startActivity(intent);}

                if(seleccionado==5){
                    this.intent = new Intent(this, Main28Activity.class);
                    startActivity(intent);}


        }

        switch (parent.getId()){
            case R.id.spinner6:
                int seleccionado=sp_plataformas.getSelectedItemPosition();
                if(seleccionado==1){
                    this.intent = new Intent(this, Main29Activity.class);
                    startActivity(intent);}

                if(seleccionado==2){
                    this.intent = new Intent(this, Main30Activity.class);
                    startActivity(intent);}

                if(seleccionado==3){
                    this.intent = new Intent(this, Main31Activity.class);
                    startActivity(intent);}

                if(seleccionado==4){
                    this.intent = new Intent(this, Main32Activity.class);
                    startActivity(intent);}

                if(seleccionado==5){
                    this.intent = new Intent(this, Main33Activity.class);
                    startActivity(intent);}

                if(seleccionado==6){
                    this.intent = new Intent(this, Main34Activity.class);
                    startActivity(intent);}

                if(seleccionado==7){
                    this.intent = new Intent(this, Main35Activity.class);
                    startActivity(intent);}

        }


        switch (parent.getId()){
            case R.id.spinner7:
                int seleccionado=sp_bienestaryegresados.getSelectedItemPosition();
                if(seleccionado==1){
                    this.intent = new Intent(this, Main36Activity.class);
                    startActivity(intent);}

                if(seleccionado==2){
                    this.intent = new Intent(this, Main37Activity.class);
                    startActivity(intent);}


        }

        switch (parent.getId()){
            case R.id.spinner8:
                int seleccionado=sp_comunidad.getSelectedItemPosition();
                if(seleccionado==1){
                    this.intent = new Intent(this, Main42Activity.class);
                    startActivity(intent);}
                if(seleccionado==2){
                    this.intent = new Intent(this, Main38Activity.class);
                    startActivity(intent);}

        }

        switch (parent.getId()){
            case R.id.spinner2:
                int seleccionado=sp_ubicaicon.getSelectedItemPosition();
                if(seleccionado==1){
                    this.intent = new Intent(this, Main39Activity.class);
                    startActivity(intent);}

                if(seleccionado==2){
                    this.intent = new Intent(this, Main40Activity.class);
                    startActivity(intent);}


        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
