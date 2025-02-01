package enumconstants;

public enum URLPropertiesConstants {

    URLONE {
        @Override
        public  String asLowerCase() {
            return  URLONE.toString().toLowerCase();
        }
    }
    ,URLTWO {
        @Override
        public  String asLowerCase() {
            return URLTWO.toString().toLowerCase();
        }
    },
    URLTHREE {
        @Override
        public  String asLowerCase() {
            return URLTHREE.toString().toLowerCase();
        }
    },
    URLFOUR {
        @Override
        public  String asLowerCase() {
            return URLFOUR.toString().toLowerCase();
        }
    },
    URLFIVE {
        @Override
        public String asLowerCase() {
            return URLFIVE.toString().toLowerCase();
        }
    }
 ,SELENIUMGRIDURL {
        @Override
        public String asLowerCase(){return SELENIUMGRIDURL.toString().toLowerCase();}
    }
    ;



    //abstract its impleentation given above
  public  abstract  String asLowerCase();


}
