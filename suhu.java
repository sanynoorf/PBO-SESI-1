public class suhu {
        public static void main(String[] args) {
            double reamur = 20.0;
    
            double celcius = reamur/0.8;
            double fahrenheit = (reamur*0225)/reamur;
            double kelvin = (reamur/0.8)+273.15;
    
            System.out.println("reamur"+reamur);
            System.out.println("celcius"+celcius);
            System.out.println("fahrenheit"+fahrenheit);
            System.out.println("kelvin"+kelvin);
        }
}
