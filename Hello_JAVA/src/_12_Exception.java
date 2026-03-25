public class _12_Exception {
    public static void main(String[] args) {
        
        /*
            try
            catch
            finally
        */
        /*int numbers[] = {1,2,3};
        int index = 5;
        try{
            int result = numbers[index];
        }catch(Exception e){
            System.out.println("_12_ExceptinError");
        }

        try{
            int result = numbers[index];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
        }catch(NegativeArraySizeException e){
            System.out.println("Error");
        }
        */

        try{
            int age = -5;
            if(age<0){
                throw new Exception("나이가 0살 보다 작을 수 없습니다.");
            }
        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }

        try{
            divide(3,0);
        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }
    }

    public static int divide(int i, int j)throws Exception {
        return i/j;
    }
    
}
