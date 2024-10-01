package enumconstants;

public enum ReadFileConstants {

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
    },
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



    //abstracct its impleentation gien abovee
  public  abstract  String asLowerCase();


}
