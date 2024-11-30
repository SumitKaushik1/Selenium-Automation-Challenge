package enumconstants;

public enum MethodPropertiesConstant {

OVERRIDEREPORTS{
    @Override
    public  String asLowerCase() {
        return OVERRIDEREPORTS.toString().toLowerCase();
    }
},
    PASSEDSTEPSSCREENSHOTS{
        @Override
        public  String asLowerCase() {
            return PASSEDSTEPSSCREENSHOTS.toString().toLowerCase();
        }
    },
    FAILEDSTEPSSCREENSHOTS{
        @Override
        public  String asLowerCase() {
            return  FAILEDSTEPSSCREENSHOTS.toString().toLowerCase();
        }
    },
    SKIPPEDSTEPSSCREENSHOTS{
        @Override
        public  String asLowerCase() {
            return   SKIPPEDSTEPSSCREENSHOTS.toString().toLowerCase();
        }
    },


    RETRYFAILEDTESTS{
        @Override
                public String asLowerCase(){ return RETRYFAILEDTESTS.toString().toLowerCase(); }
    },


    RUNMODE{
        @Override
        public String asLowerCase(){ return RUNMODE.toString().toLowerCase(); }
    };


    public abstract String asLowerCase();
}
