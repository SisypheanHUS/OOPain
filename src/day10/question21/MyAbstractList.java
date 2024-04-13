package day10.question21;

public abstract class MyAbstractList implements MyList{
    public void checkBoundaries(int index,int limit){
        if(index<0 || index>limit){
            throw new IndexOutOfBoundsException();
        }
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(String.format("[%s]",get(i).toString()));
        }
        return sb.toString();
    }
}
