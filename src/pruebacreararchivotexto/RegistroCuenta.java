package pruebacreararchivotexto;
public class RegistroCuenta {
    private int cuenta;
    private int edad;
    private String primerNombre;
    private String apellidoPaterno;
    private double saldo;

    // el constructor sin argumentos llama a otro constructor con valores predeterminados
    public RegistroCuenta()
    {
        this( 0, 0, "", "", 0.0 ); // llama al constructor con cuatro argumentos
    } // fin del constructor de RegistroCuenta sin argumentos

    // inicializa un registro
    public RegistroCuenta( int cta, int a, String nombre, String apellido, double sal )
    {
        establecerCuenta( cta );
        establecerEdad( a );
        establecerPrimerNombre( nombre );
        establecerApellidoPaterno( apellido );
        establecerSaldo( sal );
    } // fin del constructor de RegistroCuenta con cuatro argumentos

    // establece el número de cuenta
    public void establecerCuenta( int cta )
    {
        
        cuenta = cta;
    } // fin del método establecerCuenta

    // obtiene el número de cuenta
    public int obtenerCuenta()
    {
        return cuenta;
    } // fin del método obtenerCuenta
    public void establecerEdad( int a )
    {
        edad = a;
    } // fin del método establecerCuenta

    // obtiene el número de cuenta
    public int obtenerEdad()
    {
        return edad;
    }

    // establece el primer nombre
    public void establecerPrimerNombre( String nombre )
    {
        primerNombre = nombre;
    } // fin del método establecerPrimerNombre

    // obtiene el primer nombre6 public String obtenerPrimerNombre()
    public String obtenerPrimerNombre(){
        return primerNombre;
    } // fin del método obtenerPrimerNombre
    // establece el apellido paterno
    public void establecerApellidoPaterno( String apellido )
    {
        apellidoPaterno = apellido;
    } // fin del método establecerApellidoPaterno

    // obtiene el apellido paterno
    public String obtenerApellidoPaterno()
    {
        return apellidoPaterno;
    } // fin del método obtenerApellidoPaterno

    // establece el saldo
    public void establecerSaldo( double sal )
    {
        saldo = sal;
    } // fin del método establecerSaldo

    // obtiene el saldo
    public double obtenerSaldo()
    {
        return saldo;
    } // fin del método obtenerSaldo
} // fin de la clase RegistroCuenta
