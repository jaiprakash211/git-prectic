interface Calci
{
int getSum(int n1 , int n2);
}
class Calci Impl implements Calci
{
    int getSum(int n1,int n2)
    {
        return n1+n2;
    }

}
