
import javax.swing.JOptionPane;

public class inicioPAM {
 
        
    public String ReglamentoPAM() {
        return 
     "1.Se requiere 80% de asistencia para tener derecho a evaluación parcial y 80% de trabajos en clase. \n" +

     "2.Se permiten 10 minutos de tolerancia y si el alumno llega después de este tiempo puede permanecer en la clase, pero no se tomará la asistencia (Solamente en los horarios de inicio:7:00a.m y 14:00 p.m). \n" +

     "3.Las faltas deberán estar justificadas mediante el correo institucional con un plazo máximo de 24 horas posteriores a la hora de falta en clase mediante correo del tutor (a), justificantes entregados fuera de la fecha límite permitido no se aceptan, únicamente se aceptarán recetas médicas y citatorios jurídicos.(De forma física deben ser presentados al tutor para ser validados y de forma posterior emitidos). \n" +

     "4. Las tareas y trabajos deberán subirlas al Classroom de forma individual y no se recibirán de manera extemporánea.(Salvo previo justificante validado por el tutor). \n" +

     "5. Las tareas y trabajos presentarlos en tiempo y forma. La demora de un trabajo o tarea sin justificante y/o con justificante fuera del límite no se aceptan. \n" +

     "6. Utilizar el correo institucional para trabajar bajo la plataforma Google Classroom.\n" +

     "7. El plagio o copia de trabajos y/o exámenes, será condicionado a reprobar a la asignatura y se reportará al área correspondiente. \n"+

     "8. Cualquier deshonestidad académica será sancionada reprobando el parcial sin derecho a examen final. \n" +

     "9. En circunstancia de indisciplina o falta de respeto por parte del alumno hacia docentes,administrativos, compañeros o cualquier persona perteneciente a la universidad, se realizará una primera llama de atención, si el alumno hace caso omiso tendrá que abandonar el aula, tres incidencias de este tipo el alumno no tendrá derecho a examen final o parcial. \n" +

     "10. Uso de laptops y/o dispositivos móviles quedará limitados a uso exclusivo de las actividades que así lo requieran. \n" +

     "11. Prohibido el uso de audífonos durante la clase. \n" +

     "12. Prohibido comer y/o tomar líquidos en el salón. \n" +

     "13. Prohibido sentarse encima de las mesas , así como columpiarse en las sillas. \n" +

     "14. Todo tema académido debe ser revisado primeramente por parte del alumno con el docente, de no resolverse, pasar con su respectivo tutor, y de ser necesario con la coordinación de tutores. En caso de no solucionarse pasar a la dirección del programa educativo (debe mantenerse este seguimiento de forma obligatoria). \n" +

     "15. Cualquier situación no prevista en el presente reglamento pasar directamente con la dirección del programa educativo. \n" +

     "16. El día destinado a entrega de calificaciones todos los estudiantes deben estar presentes, ese día se entregarán exámenes y se brindará retroalimentación. \n" +

     "17. Este reglamento entra en vigor después de que se firme o se acepte por la mayoría de los estudiantes asistentes a la primera sesión de la materia, una vez firmado o aceptado por el 50% más el jefe de grupo, es vigente para todo alumno inscrito en el curso aunque no esté presente en la primera sesión.";
    
    }

    public String LineamientosClassroom() {
        return 
     "Entregar los trabajos para su revisión. \n" +

     "Entregas en PDF. \n" +

     "Avisos en clase. \n" +
     
     "Entregas autorizadas con retraso, 5 Calif Max";
    }

    public String FechasdeParciales() {
        return 
         "1er Parcial: 01-10-25. \n" +
         "2do Parcial: 05-10-25. \n" +
         "3er Parcial: 03-12-25";
    }

    public String PorcentajesporParcial() {
        return 
         "Parcial 1: E. Conocimiento 40%, E. Desempeño 20%, E. Producto 30%, P. Integrador 10%. \n" +
         "Parcial 2: E. Conocimiento 40%, E. Desempeño 20%, E. Producto 20%, P. Integrador 20%. \n" +
         "Parcial 3: E. Conocimiento 20%, E. Desempeño 10%, E. Producto 40%, P. Integrador 30%";
    }
    
    public static void main(String[] args) {
       String[] opciones = {"Reglamento PAM", "Lineamientos...", "Fechas...", "Porcentajes...", "Salir..."};
        int seleccion;

        do {
            seleccion = JOptionPane.showOptionDialog(
                null,
                "Selecciona una opción",
                "MENÚ PAM",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );
             if (seleccion == -1 || seleccion == 4) {
                break;
             }
            switch (seleccion) {
                case 0:
                    JOptionPane.showMessageDialog(null, 
     "1.Se requiere 80% de asistencia para tener derecho a evaluación parcial y 80% de trabajos en clase. \n" +

     "2.Se permiten 10 minutos de tolerancia y si el alumno llega después de este tiempo puede permanecer en la clase, pero no se tomará la asistencia (Solamente en los horarios de inicio:7:00a.m y 14:00 p.m). \n" +

     "3.Las faltas deberán estar justificadas mediante el correo institucional con un plazo máximo de 24 horas posteriores a la hora de falta en clase mediante correo del tutor (a), justificantes entregados fuera de la fecha límite permitido no se aceptan, únicamente se aceptarán recetas médicas y citatorios jurídicos.(De forma física deben ser presentados al tutor para ser validados y de forma posterior emitidos). \n" +

     "4. Las tareas y trabajos deberán subirlas al Classroom de forma individual y no se recibirán de manera extemporánea.(Salvo previo justificante validado por el tutor). \n" +

     "5. Las tareas y trabajos presentarlos en tiempo y forma. La demora de un trabajo o tarea sin justificante y/o con justificante fuera del límite no se aceptan. \n" +

     "6. Utilizar el correo institucional para trabajar bajo la plataforma Google Classroom.\n" +

     "7. El plagio o copia de trabajos y/o exámenes, será condicionado a reprobar a la asignatura y se reportará al área correspondiente. \n"+

     "8. Cualquier deshonestidad académica será sancionada reprobando el parcial sin derecho a examen final. \n" +

     "9. En circunstancia de indisciplina o falta de respeto por parte del alumno hacia docentes,administrativos, compañeros o cualquier persona perteneciente a la universidad, se realizará una primera llama de atención, si el alumno hace caso omiso tendrá que abandonar el aula, tres incidencias de este tipo el alumno no tendrá derecho a examen final o parcial. \n" +

     "10. Uso de laptops y/o dispositivos móviles quedará limitados a uso exclusivo de las actividades que así lo requieran. \n" +

     "11. Prohibido el uso de audífonos durante la clase. \n" +

     "12. Prohibido comer y/o tomar líquidos en el salón. \n" +

     "13. Prohibido sentarse encima de las mesas , así como columpiarse en las sillas. \n" +

     "14. Todo tema académido debe ser revisado primeramente por parte del alumno con el docente, de no resolverse, pasar con su respectivo tutor, y de ser necesario con la coordinación de tutores. En caso de no solucionarse pasar a la dirección del programa educativo (debe mantenerse este seguimiento de forma obligatoria). \n" +

     "15. Cualquier situación no prevista en el presente reglamento pasar directamente con la dirección del programa educativo. \n" +

     "16. El día destinado a entrega de calificaciones todos los estudiantes deben estar presentes, ese día se entregarán exámenes y se brindará retroalimentación. \n" +

     "17. Este reglamento entra en vigor después de que se firme o se acepte por la mayoría de los estudiantes asistentes a la primera sesión de la materia, una vez firmado o aceptado por el 50% más el jefe de grupo, es vigente para todo alumno inscrito en el curso aunque no esté presente en la primera sesión.");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, 
                         "Entregar los trabajos para su revisión. \n" +
                         "Entregas en PDF. \n" +
                         "Avisos en clase. \n" +
                         "Entregas autorizadas con retraso, 5 Calif Max");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, 
                         "1er Parcial: 01-10-25. \n" +
                         "2do Parcial: 05-10-25. \n" +
                         "3er Parcial: 03-12-25");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, 
                         "Parcial 1: E. Conocimiento 40%, E. Desempeño 20%, E. Producto 30%, P. Integrador 10%. \\n\" +\n" +
                         "Parcial 2: E. Conocimiento 40%, E. Desempeño 20%, E. Producto 20%, P. Integrador 20%. \\n\" +\n" +
                         "Parcial 3: E. Conocimiento 20%, E. Desempeño 10%, E. Producto 40%, P. Integrador 30%\";");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (true);
        
        JOptionPane.showMessageDialog(null, "Tu Consulta Ha Sido Terminada");
    }
}
    