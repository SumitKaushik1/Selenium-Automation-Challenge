package enumconstants;

public enum LoginCredentialsPropertiesConstants {



    USERNAME {
        @Override
        public  String asLowerCase() {
            return USERNAME.toString().toLowerCase();
        }
    },PASSWORD {
        @Override
        public  String asLowerCase() {
            return PASSWORD.toString().toLowerCase();
        }
    },PASSWORD1 {
        @Override
        public    String asLowerCase() {
            return PASSWORD1.toString().toLowerCase();
        }
    },EMAILADDRESS {
        @Override
        public String asLowerCase() {
            return EMAILADDRESS.toString().toLowerCase();
        }
    };


    //abstract its impleentation given above
    public  abstract  String asLowerCase();
}
