package ps.ja15.Entregable.Ejemplos;

import jakarta.persistence.*;

public class Ejemplo {
    @Entity
    public class Persona {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;

        @OneToOne(mappedBy = "persona")
        private Direccion direccion;

        // Getters y setters
    }

    @Entity
    public class Direccion {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String calle;

        @OneToOne
        @JoinColumn(name = "persona_id")
        private Persona persona;

        // Getters y setters
    }
    @Entity
    public class Autor {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;

        @OneToMany(mappedBy = "autor")
        private List<Libro> libros;

        // Getters y setters
    }

    @Entity
    public class Libro {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String titulo;

        @ManyToOne
        @JoinColumn(name = "autor_id")
        private Autor autor;

        // Getters y setters
    }


^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    @Entity
    public class Estudiante {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;

        @ManyToMany
        @JoinTable(
                name = "estudiante_curso",
                joinColumns = @JoinColumn(name = "estudiante_id"),
                inverseJoinColumns = @JoinColumn(name = "curso_id")
        )
        private List<Curso> cursos;

        // Getters y setters
    }

    @Entity
    public class Curso {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;

        @ManyToMany(mappedBy = "cursos")
        private List<Estudiante> estudiantes;

        // Getters y setters
    }





}
