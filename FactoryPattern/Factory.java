package FactoryPattern;

public abstract class Factory {
    public abstract Transportation createTrans();
    public void doDeliverJob(){
        Transportation trans = createTrans();
        trans.deliver();
    }
}
