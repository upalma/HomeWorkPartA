package Singleton;

// File Name: UseSingleton.java
public class UseSingleton {

        private static UseSingleton singleton = new UseSingleton ( );

        //A private Constructor prevents any other class from instantiating.

        private UseSingleton () { }

        // Static 'instance' method
        public static UseSingleton  getInstance( ) {
            return singleton;
        }

        // Other methods protected by singleton
        protected static void whiteHouse( ) {
            System.out.println("White House, the heart of USA govt. administration");
        }
    }