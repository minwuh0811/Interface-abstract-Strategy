public abstract  class Fighter {
    private ActionStrategy actionStrategy;

    public void setActionStratege(ActionStrategy actionStratege){
        this.actionStrategy=actionStratege;
    }

    public ActionStrategy performAction(){
        return actionStrategy;
    }

    abstract void greet();
}
