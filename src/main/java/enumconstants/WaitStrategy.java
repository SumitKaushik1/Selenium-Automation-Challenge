package enumconstants;

public enum WaitStrategy {

    //to make robust code so any user cannot change the value in the code bydefault whcih can be done in string

    //sometime user pass hte value like any value which is string so anyone can change that string so we make
    //predefined value all the places of code and control these constants from one class which enum
    CLICKABLE,VISIBLE,NONE;
}
