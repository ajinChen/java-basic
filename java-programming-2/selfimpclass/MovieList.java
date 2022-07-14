package selfimpclass;

public class MovieList implements SelfList<Member>{
    
    @Override
    public void add(Member value) {
        System.out.println(value);
    }

    @Override
    public Member get(int index) {
        return new Member("Hi", index);
    }

    @Override
    public Member remove(int index) {
        return new Member("Hi", index);
    }


}
