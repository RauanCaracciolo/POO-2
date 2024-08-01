package exercicios.ex13;

public class StringDNA {
    private String dna;
    public StringDNA(String dna) throws Exception{
        setDNA(dna);
    }
    private void setDNA(String dna) throws Exception{
        //dna = dna.replaceAll("[^ACGT]+", "");
        //this.dna = dna;
        if(!dna.matches("[ACGT]+")){
            throw new Exception("DNA deve ser composto por uma string que ccontenha somente os caracteres A, C, G e T");
        }
        this.dna = dna;
    }
    public char charAt(int index){
        return dna.charAt(index);
    }
    public int quantosA(){
        return quantos('A');
    }
    public int quantosC(){
        return quantos('C');
    }
    public int quantosG(){
        return quantos('G');
    }
    public int quantosT(){
        return quantos('T');
    }

    private int quantos(char c){
        int contador = 0;
        for(int i = 0; i < dna.length(); i++){
            if(dna.charAt(i) == c){
                contador++;
            }
        }
        return contador;
    }
    public StringDNA reversoComplementar() throws Exception{
        String reverso = "";
        for(int i = dna.length() -1; i >= 0; i--){
            switch (dna.charAt(i)){
                case'A':
                    reverso += "T";
                    break;
                case'C':
                    reverso += "G";
                    break;
                case'T':
                    reverso += "C";
                    break;
                case'G':
                    reverso +="A";
                    break;
            }
        }
        return new StringDNA(reverso);
    }
    public int compara(StringDNA dna){
        int contador = 0;
        int index = 0;
        while((index < this.lenght()) && (index < dna.lenght())){
            if(this.charAt(index) == dna.charAt(index)){
                contador+=3;
            }
            if(this.charAt(index) == 'A' && dna.charAt(index) == 'T' || this.charAt(index) == 'G' && dna.charAt(index) == 'C'){
                contador += 1;
            }
            if(this.charAt(index) == 'C' && dna.charAt(index) == 'G' || this.charAt(index) == 'G' && dna.charAt(index) == 'C'){
                contador +=1;
            }
            index++;
        }
        return contador;
    }
    public int lenght(){
        return dna.length();
    }

    @Override
    public String toString(){
        return dna;
    }


}
