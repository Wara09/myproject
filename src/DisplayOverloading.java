class DisplayOverloading {
    public void disp( char c)
    {
        System.out.println(c);
    }

    public void disp(int num,char c)
    {
        System.out.println(num+ " " +c);

    }


}
class sample
{
    public static void main(String[] args) {

        DisplayOverloading obj = new DisplayOverloading();
        obj.disp('a');
        obj.disp(10,'a' );
    }



}
