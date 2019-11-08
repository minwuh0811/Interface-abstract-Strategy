public abstract  class Fighter {
    private ActionStrategy actionStrategy;

    public void setActionStratege(ActionStrategy actionStratege){
        this.actionStrategy=actionStratege;
    }

    //public ActionStrategy performAction(){
        //return actionStrategy;
    //}

    public String performAction(){
        return actionStrategy.action();
    }


    abstract void greet();
}
