#language:es

@test
Característica: reto colpatria

    Antecedentes:
        Dado que Kevin desea ingresar a la pagina

    @Test1
    Esquema del escenario: Flujo 1
        Cuando agrego un registro
            | idCaso   | nombre   | apellido   | correo   | edad   | salario   | departamento   |
            | <idCaso> | <nombre> | <apellido> | <correo> | <edad> | <salario> | <departamento> |
        Entonces Visualizo el registro creado
        Cuando permito eliminar cualquier registro de la tabla
            | <filaEliminar> |
        Entonces visualizo el registro eliminado
            | <filaEliminar> |
        Ejemplos:
            | idCaso | nombre    | apellido   | correo          | edad | salario | departamento | filaEliminar |
        ##@externaldata@./src/test/resources/dataDriven/reto1.xlsx@Hoja1
   |1   |sophos   |solutions   |sophos@s.com   |55   |10000   |finanzas   |2|
   |2   |colpatria   |scotiabank   |colpatria@r.com   |24   |20000   |recursos   |8|
   |3   |medellin   |antioquia   |mede@kk.com   |86   |5000000   |tecnologia   |4|

    @Test2
    Esquema del escenario: Flujo 2
        Cuando seleccionar fechas en las opciones
            | idCaso   | fecha1   | fecha2   |
            | <idCaso> | <fecha1> | <fecha2> |
        Ejemplos:
            | idCaso | fecha1    | fecha2                     |
        ##@externaldata@./src/test/resources/dataDriven/reto2.xlsx@Hoja1
   |1   |8/11/1956   |January 20, 1965 4:00 PM|
   |2   |8/11/1957   |February 14, 1986 8:30 AM|
   |3   |8/11/1958   |December 24, 1994 11:45 AM|


    @Test3
    Esquema del escenario: Flujo 3
        Cuando interactuo con las alertas
            | <nombre> |
        Ejemplos:
            | nombre |
        ##@externaldata@./src/test/resources/dataDriven/reto3.xlsx@Hoja1
   |sophos|
   |colpatria|
   |kevin|
