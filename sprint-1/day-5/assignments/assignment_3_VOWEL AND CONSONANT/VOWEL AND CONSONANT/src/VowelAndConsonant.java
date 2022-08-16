public class VowelAndConsonant {

    char input;
    void check(char input){
        if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u'||input=='A'||input=='E'||input=='I'||input=='O'||input=='U'){
            System.out.println("character is vowel");
        }
        else if(input=='b'||input=='c'||input=='d'||input=='f'||input=='g'||input=='h'||input=='j'||input=='k'||input=='l'||input=='m'||input=='n'||input=='p'||input=='q'||input=='r'||input=='s'||input=='t'||input=='v'||input=='w'||input=='x'||input=='y'||input=='z'||input=='B'||input=='C'||input=='D'||input=='F'||input=='G'||input=='H'||input=='J'||input=='K'||input=='L'||input=='M'||input=='N'||input=='P'||input=='Q'||input=='R'||input=='S'||input=='T'||input=='V'||input=='W'||input=='X'||input=='Y'||input=='Z'){
            System.out.println("character is consonant");
        }
        else {
            System.out.println("invalid character");
        }
    }

    public static void main(String[] args) {
        VowelAndConsonant character=new VowelAndConsonant();
        character.check('a');
        character.check('z');
        character.check('1');
    }
}
