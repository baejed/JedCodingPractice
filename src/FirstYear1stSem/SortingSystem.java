package FirstYear1stSem;

public class SortingSystem {

    public static void main(String args[]){

        String[] products = {"Jed", "Val", "Jules", "MJ", "Yuuki", "Kyle", "Yanyan", "Zian","Archimedes", "archimedes", "Archimedess","123"};
        String temporary;
        int error, minLength;

        for(int i = 0; i < products.length; i++) System.out.println(products[i]);

        System.out.println("\nsorting\n");

        do{

            error = 0;

            for(int i = 0; i < products.length - 1; i++){

                minLength = Math.min(products[i].length(), products[i+1].length());

                if(products[i].equals(products[i+1])) continue;
                for(int j = 0; j < minLength; j++){
                    if(products[i].toUpperCase().charAt(j) > products[i+1].toUpperCase().charAt(j)){
                        error++;
                        temporary = products[i];
                        products[i] = products[i+1];
                        products[i+1] = temporary;
                        break;
                    }

                    if(products[i].toUpperCase().charAt(j) == products[i+1].toUpperCase().charAt(j)){
                        if(!(j == minLength - 1))continue;
                        if(products[i].charAt(j) > products[i+1].charAt(j)){
                            error++;
                            temporary = products[i];
                            products[i] = products[i+1];
                            products[i+1] = temporary;
                            break;
                        }
                        if(products[i].length() > products[i+1].length()){
                            error++;
                            temporary = products[i];
                            products[i] = products[i+1];
                            products[i+1] = temporary;
                        }
                    }
                    break;
                }

            }

        }while(error != 0);

        for(int i = 0; i < products.length; i++) System.out.println(products[i]);

    }

    public static String[] sort(String[] products){
        String temporary;
        int error, minLength;

        do{

            error = 0;

            for(int i = 0; i < products.length - 1; i++){

                minLength = Math.min(products[i].length(), products[i+1].length());

                if(products[i].equals(products[i+1])) continue;
                for(int j = 0; j < minLength; j++){
                    if(products[i].charAt(j) > products[i+1].charAt(j)){
                        error++;
                        temporary = products[i];
                        products[i] = products[i+1];
                        products[i+1] = temporary;
                        break;
                    }
                    if(products[i].charAt(j) == products[i+1].charAt(j)){
                        if(!(j == minLength - 1))continue;
                        if(products[i].length() > products[i+1].length()){
                            error++;
                            temporary = products[i];
                            products[i] = products[i+1];
                            products[i+1] = temporary;
                            continue;
                        }
                    }
                    break;
                }

            }

        }while(error != 0);

        //for(int i = 0; i < products.length; i++) System.out.println(products[i]);

        return products;

    }

}
