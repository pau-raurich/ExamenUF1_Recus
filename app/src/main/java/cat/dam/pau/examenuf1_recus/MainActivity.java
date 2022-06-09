package cat.dam.pau.examenuf1_recus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //TextViews Esquerra
    ImageView img_esquerra_r1c1;
    ImageView img_esquerra_r1c2;
    ImageView img_esquerra_r1c3;

    ImageView img_esquerra_r2c1;
    ImageView img_esquerra_r2c2;
    ImageView img_esquerra_r2c3;

    ImageView img_esquerra_r3c1;
    ImageView img_esquerra_r3c2;
    ImageView img_esquerra_r3c3;

    //TextViews Dreta
    ImageView img_dreta_r1c1;
    ImageView img_dreta_r1c2;
    ImageView img_dreta_r1c3;

    ImageView img_dreta_r2c1;
    ImageView img_dreta_r2c2;
    ImageView img_dreta_r2c3;

    ImageView img_dreta_r3c1;
    ImageView img_dreta_r3c2;
    ImageView img_dreta_r3c3;

    //ImageButton
    ImageButton greater;
    ImageButton less;
    ImageButton equal;

    //TextView
    TextView tv_punts;

    //Buttons
    Button btn_sortir;

    //Object Class
    static Random rand = new Random();


    //Variables
    public static int puntsUsuari = 0;
    static int nTaulaEsquerra = 0;
    static int nTaulaDreta = 0;


    static ArrayList<Animal> animals = new ArrayList<Animal>(); //Array en static que guarda els objectes tipu Animal

    /**
     * Funcio que servira per inserir valors dins del ArrayList
     */
    public void Inserir_Animals(){

        Bitmap bmImg0 = BitmapFactory.decodeResource(getResources(),R.drawable.i00);
        animals.add(0, new Animal(bmImg0, 0));
        Bitmap bmImg1 = BitmapFactory.decodeResource(getResources(),R.drawable.cairuts);
        animals.add(1, new Animal(bmImg1, 1));
        Bitmap bmImg2 = BitmapFactory.decodeResource(getResources(),R.drawable.cairuts2);
        animals.add(2, new Animal(bmImg2, 2));
        Bitmap bmImg3 = BitmapFactory.decodeResource(getResources(),R.drawable.drac);
        animals.add(3, new Animal(bmImg3, 3));
        Bitmap bmImg4 = BitmapFactory.decodeResource(getResources(),R.drawable.rodons);
        animals.add(4, new Animal(bmImg4, 4));
        Bitmap bmImg5 = BitmapFactory.decodeResource(getResources(),R.drawable.rodons2);
        animals.add(5, new Animal(bmImg5, 5));
    }

    /**
     * Funcio que ens servira per inserir una imatge amb un valor a cada ImageView de la taula esquerra
     */
    public void InserirTaulaEsquerra(
            ImageView img_esquerra_r1c1,ImageView img_esquerra_r1c2,ImageView img_esquerra_r1c3,
            ImageView img_esquerra_r2c1,ImageView img_esquerra_r2c2,ImageView img_esquerra_r2c3,
            ImageView img_esquerra_r3c1,ImageView img_esquerra_r3c2,ImageView img_esquerra_r3c3
    ){

        int punts = 0;

        int numRand,casella1,casella2,casella3,casella4,casella5,casella6,casella7,casella8,casella9;

        numRand = rand.nextInt(5); //Genarem un numero del 0 al 10 per escullir un animal

        //ImageView img_esquerra_r1c1
        casella1 = numRand;

        img_esquerra_r1c1.setImageBitmap(animals.get(casella1).getImatge()); //Aconseguim la imatge del objecte animal
        punts += animals.get(casella1).getPuntuacio(); //Aconseguim els punts del objecte animal

        //ImageView img_esquerra_r1c2
        numRand = rand.nextInt(5);
        casella2 = numRand;
        img_esquerra_r1c2.setImageBitmap(animals.get(casella2).getImatge());
        punts += animals.get(casella2).getPuntuacio();

        //ImageView img_esquerra_r1c3
        numRand = rand.nextInt(5);
        casella3 = numRand;
        img_esquerra_r1c3.setImageBitmap(animals.get(casella3).getImatge());
        punts += animals.get(casella3).getPuntuacio();
        /*----------------------------------------------------------------*/
        //ImageView img_esquerra_r2c1
        numRand = rand.nextInt(5);
        casella4 = numRand;
        img_esquerra_r2c1.setImageBitmap(animals.get(casella4).getImatge());
        punts += animals.get(casella4).getPuntuacio();

        //ImageView img_esquerra_r2c2
        numRand = rand.nextInt(5);
        casella5 = numRand;
        img_esquerra_r2c2.setImageBitmap(animals.get(casella5).getImatge());
        punts += animals.get(casella5).getPuntuacio();

        //ImageView img_esquerra_r2c3
        numRand = rand.nextInt(5);
        casella6= numRand;
        img_esquerra_r2c3.setImageBitmap(animals.get(casella6).getImatge());
        punts += animals.get(casella6).getPuntuacio();
        /*----------------------------------------------------------------*/
        //ImageView img_esquerra_r3c1
        numRand = rand.nextInt(5);
        casella7 = numRand;
        img_esquerra_r3c1.setImageBitmap(animals.get(casella7).getImatge());
        punts += animals.get(casella7).getPuntuacio();

        //ImageView img_esquerra_r3c2
        numRand = rand.nextInt(5);
        casella8 = numRand;
        img_esquerra_r3c2.setImageBitmap(animals.get(casella8).getImatge());
        punts += animals.get(casella8).getPuntuacio();

        //ImageView img_esquerra_r3c3
        numRand = rand.nextInt(5);
        casella9= numRand;
        img_esquerra_r3c3.setImageBitmap(animals.get(casella9).getImatge());
        punts += animals.get(casella9).getPuntuacio();
        /*----------------------------------------------------------------*/

        System.out.println("Taula esquerra: " + punts);

        nTaulaEsquerra = punts;
    }

    /**
     * Funcio que ens servira per inserir una imatge amb un valor a cada ImageView de la taula dreta

     */
    public void InserirTaulaDreta(
            ImageView img_dreta_r1c1,ImageView img_dreta_r1c2,ImageView img_dreta_r1c3,
            ImageView img_dreta_r2c1,ImageView img_dreta_r2c2,ImageView img_dreta_r2c3,
            ImageView img_dreta_r3c1,ImageView img_dreta_r3c2,ImageView img_dreta_r3c3
    ){

        int punts = 0;

        int numRand,casella1,casella2,casella3,casella4,casella5,casella6,casella7,casella8,casella9;

        numRand = rand.nextInt(5); //Genarem un numero del 0 al 10 per escullir un animal

        //ImageView img_esquerra_r1c1
        casella1 = numRand;

        img_dreta_r1c1.setImageBitmap(animals.get(casella1).getImatge()); //Aconseguim la imatge del objecte animal
        punts += animals.get(casella1).getPuntuacio(); //Aconseguim els punts del objecte animal

        //ImageView img_dreta_r1c2
        numRand = rand.nextInt(5);
        casella2 = numRand;
        img_dreta_r1c2.setImageBitmap(animals.get(casella2).getImatge());
        punts += animals.get(casella2).getPuntuacio();

        //ImageView img_dreta_r1c3
        numRand = rand.nextInt(5);
        casella3 = numRand;
        img_dreta_r1c3.setImageBitmap(animals.get(casella3).getImatge());
        punts += animals.get(casella3).getPuntuacio();
        /*----------------------------------------------------------------*/
        //ImageView img_dreta_r2c1
        numRand = rand.nextInt(5);
        casella4 = numRand;
        img_dreta_r2c1.setImageBitmap(animals.get(casella4).getImatge());
        punts += animals.get(casella4).getPuntuacio();

        //ImageView img_dreta_r2c2
        numRand = rand.nextInt(5);
        casella5 = numRand;
        img_dreta_r2c2.setImageBitmap(animals.get(casella5).getImatge());
        punts += animals.get(casella5).getPuntuacio();

        //ImageView img_dreta_r2c3
        numRand = rand.nextInt(5);
        casella6= numRand;
        img_dreta_r2c3.setImageBitmap(animals.get(casella6).getImatge());
        punts += animals.get(casella6).getPuntuacio();
        /*----------------------------------------------------------------*/
        //ImageView img_dreta_r3c1
        numRand = rand.nextInt(5);
        casella7 = numRand;
        img_dreta_r3c1.setImageBitmap(animals.get(casella7).getImatge());
        punts += animals.get(casella7).getPuntuacio();

        //ImageView img_dreta_r3c2
        numRand = rand.nextInt(5);
        casella8 = numRand;
        img_dreta_r3c2.setImageBitmap(animals.get(casella8).getImatge());
        punts += animals.get(casella8).getPuntuacio();

        //ImageView img_dreta_r3c3
        numRand = rand.nextInt(5);
        casella9= numRand;
        img_dreta_r3c3.setImageBitmap(animals.get(casella9).getImatge());
        punts += animals.get(casella9).getPuntuacio();
        /*----------------------------------------------------------------*/

        System.out.println("Taula esquerra: " + punts);

        nTaulaDreta = punts;
    }
    /**
     * Funcio per calcular el resultat mes la decissio del usuari
     * @param eleccioUser - eleccio del usuari en valor integer
     * @return boolean - true or false depenguent si el usuari ha encertat o no
     */
    public void Resultat(int eleccioUser){

        boolean encertat = false;

        int conclusio = 0;

        //Condicional per saber el resultat entre quina taula te mes animals o si son iguals
        if(nTaulaEsquerra > nTaulaDreta){
            conclusio = 1;
        }
        else if(nTaulaEsquerra < nTaulaDreta){
            conclusio = 3;
        }
        else{
            conclusio = 2;
        }

        //Condicional per saber si la resposta escullida per el usuari es encertada o no
        if(eleccioUser == conclusio){
            encertat = true;
        }
        else{
            encertat = false;
        }

        Usuari_punts(encertat);

    }

    /**
     * Funcio per modificar el puntuatge del usuari
     * @param encertat boolea que representa si el usuari ha encertat o no
     */
    public void Usuari_punts(boolean encertat){

        String punts = tv_punts.getText().toString();
        int puntsConversio = Integer.parseInt(punts); //Aconseguim els punts del usuari mostrats per pantalla i fem la conversio a int per poder treballar amb el numero

        puntsUsuari = puntsConversio; //Guardem els punts que te el usuari dins de la variable que es troba en static

        //Condicional per sumar o restar el puntuatge del usuari
        if(encertat){
            puntsConversio++;
            tv_punts.setText(Integer.toString(puntsConversio));
        }else{
            puntsConversio = 0;
            tv_punts.setText(Integer.toString(puntsConversio));
        }

    }

    /**
     * Funcio que executara totes les funcions necessaries per tal de simular una sessio de joc
     */
    public void SessioJoc(){

        InserirTaulaEsquerra(
                 img_esquerra_r1c1, img_esquerra_r1c2, img_esquerra_r1c3,
                 img_esquerra_r2c1, img_esquerra_r2c2, img_esquerra_r2c3,
                 img_esquerra_r3c1, img_esquerra_r3c2, img_esquerra_r3c3        );
        InserirTaulaDreta(
                 img_dreta_r1c1, img_dreta_r1c2, img_dreta_r1c3,
                 img_dreta_r2c1, img_dreta_r2c2, img_dreta_r2c3,
                 img_dreta_r3c1, img_dreta_r3c2, img_dreta_r3c3
        );

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_esquerra_r1c1 = (ImageView) findViewById(R.id.img_esquerra_r1c1);
        img_esquerra_r1c2 = (ImageView) findViewById(R.id.img_esquerra_r1c2);
        img_esquerra_r1c3 = (ImageView) findViewById(R.id.img_esquerra_r1c3);
        img_esquerra_r2c1 = (ImageView) findViewById(R.id.img_esquerra_r2c1);
        img_esquerra_r2c2 = (ImageView) findViewById(R.id.img_esquerra_r2c2);
        img_esquerra_r2c3 = (ImageView) findViewById(R.id.img_esquerra_r2c3);
        img_esquerra_r3c1 = (ImageView) findViewById(R.id.img_esquerra_r3c1);
        img_esquerra_r3c2 = (ImageView) findViewById(R.id.img_esquerra_r3c2);
        img_esquerra_r3c3 = (ImageView) findViewById(R.id.img_esquerra_r3c3);
        img_dreta_r1c1 = (ImageView) findViewById(R.id.img_dreta_r1c1);
        img_dreta_r1c2 = (ImageView) findViewById(R.id.img_dreta_r1c2);
        img_dreta_r1c3 = (ImageView) findViewById(R.id.img_dreta_r1c3);
        img_dreta_r2c1 = (ImageView) findViewById(R.id.img_dreta_r2c1);
        img_dreta_r2c2 = (ImageView) findViewById(R.id.img_dreta_r2c2);
        img_dreta_r2c3 = (ImageView) findViewById(R.id.img_dreta_r2c3);
        img_dreta_r3c1 = (ImageView) findViewById(R.id.img_dreta_r3c1);
        img_dreta_r3c2 = (ImageView) findViewById(R.id.img_dreta_r3c2);
        img_dreta_r3c3 = (ImageView) findViewById(R.id.img_dreta_r3c3);
        greater = (ImageButton) findViewById(R.id.greater);
        equal = (ImageButton) findViewById(R.id.equal);
        less = (ImageButton) findViewById(R.id.less);
        tv_punts = (TextView) findViewById(R.id.tv_punts);
        btn_sortir = (Button) findViewById(R.id.btn_sortir);

        Inserir_Animals();
        SessioJoc();


        greater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = 1;
                Resultat(numero);
                SessioJoc();
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = 2;
                Resultat(numero);
                SessioJoc();
            }
        });

        less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = 3;
                Resultat(numero);
                SessioJoc();
            }
        });

        btn_sortir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Credits.class));
                finish();
            }
        });

    }

}