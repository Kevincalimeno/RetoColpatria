package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import modelos.DataReto1;
import modelos.DataReto2;
import net.serenitybdd.screenplay.actors.OnlineCast;
import preguntas.ValidarQueRegistro;
import preguntas.ValidarRegistro;
import tareas.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static util.Constants.ZERO;

public class Stepdefinitions {

    @Before
    public void configuracionInicial() {
        setTheStage(new OnlineCast());
    }


    @Dado("^que Kevin desea ingresar a la pagina$")
    public void que_Kevin_desea_ingresar_a_la_pagina() {
        theActorCalled("usuario").wasAbleTo(AbrirLa.pagina());
    }


    @Cuando("^agrego un registro$")
    public void agrego_un_registro(List<DataReto1> dataReto1s) {
        theActorInTheSpotlight().attemptsTo(AgregarUn.registro(dataReto1s.get(ZERO)));
    }

    @Entonces("^Visualizo el registro creado$")
    public void visualizo_el_registro_creado() {
        theActorInTheSpotlight().should(seeThat(ValidarRegistro.creado()));
    }

    @Cuando("^permito eliminar cualquier registro de la tabla$")
    public void permito_eliminar_cualquier_registro_de_la_tabla(List<Integer> word) {
        int fila = word.get(ZERO);
        theActorInTheSpotlight().attemptsTo(EliminarCualquier.registro(fila));
    }


    @Entonces("^visualizo el registro eliminado$")
    public void visualizo_el_registro_eliminado(List<Integer> word) {
        int fila = word.get(ZERO);
        theActorInTheSpotlight().should(seeThat(ValidarQueRegistro.eliminado(fila)));
    }

    @Cuando("^seleccionar fechas en las opciones$")
    public void seleccionar_fechas_en_las_opciones(List<DataReto2> dataReto2s) {
        theActorInTheSpotlight().attemptsTo(Seleccionar.fecha(dataReto2s.get(ZERO)));
    }


    @Cuando("^interactuo con las alertas$")
    public void interactuo_con_las_alertas(List<String> word) {
        String nombre = word.get(ZERO);
        theActorInTheSpotlight().attemptsTo(Interactuar.alertas(nombre));
    }



}
