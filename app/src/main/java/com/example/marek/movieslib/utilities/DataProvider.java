package com.example.marek.movieslib.utilities;

import java.util.ArrayList;
import java.util.List;

import com.example.marek.movieslib.R;
import com.example.marek.movieslib.models.ActorModel;
import com.example.marek.movieslib.models.MovieModel;
import com.example.marek.movieslib.models.RoleModel;

/**
 * Created by Marek on 14.04.2018.
 */

public class DataProvider {
    public static List<MovieModel> getData() {
        ArrayList<MovieModel> models = new ArrayList<>();

        models.add(new MovieModel("The Fate of The Furious", MovieModel.Category.Action, "Now that Dom and Letty are on their honeymoon and Brian and Mia have retired from the game-and the rest of the crew has been exonerated-the globetrotting team has found a semblance of a normal life. But when a mysterious woman seduces Dom into the world of crime he can't seem to escape and a betrayal of those closest to him, they will face trials that will test them as never before. From the shores of Cuba and the streets of New York City to the icy plains off the arctic Barents Sea, the elite force will crisscross the globe to stop an anarchist from unleashing chaos on the world's stage... and to bring home the man who made them a family.", R.drawable.fnf8_cover2));
        models.add(new MovieModel("Shrek 2", MovieModel.Category.Comedy, "Picking up where the first Shrek movie left off, Shrek and Fiona are now happily married and living in Shrek's house in the swamp. Donkey reappears, much to Shrek and Fiona's annoyance. The King and Queen of Far Far Away hear of their daughter's (Fiona) marriage and invite Shrek and Fiona to the palace to celebrate. When the King discover's that Shrek is an ogre he is immediately opposed to the marriage. Prince Charming, who is determined to marry Fiona, appears and he and the King band together to separate Shrek and Fiona and get Fiona to marry Prince Charming. The Fairy Godmother also appears, and she is not as benevolent as you think.", R.drawable.shrek2_cover));
        models.add(new MovieModel("Gladiator", MovieModel.Category.Historical, "Maximus is a powerful Roman general, loved by the people and the aging Emperor, Marcus Aurelius. Before his death, the Emperor chooses Maximus to be his heir over his own son, Commodus, and a power struggle leaves Maximus and his family condemned to death. The powerful general is unable to save his family, and his loss of will allows him to get captured and put into the Gladiator games until he dies. The only desire that fuels him now is the chance to rise to the top so that he will be able to look into the eyes of the man who will feel his revenge.", R.drawable.gladiator_cover));
        models.add(new MovieModel("Indiana Jones and Crystal Skull", MovieModel.Category.Adventure, "During the Cold War, Soviet agents watch Professor Henry Jones when a young man brings him a coded message from an aged, demented colleague, Harold Oxley. Led by the brilliant Irina Spalko, the Soviets tail Jones and the young man, Mutt, to Peru. With Oxley's code, they find a legendary skull made of a single piece of quartz. If Jones can deliver the skull to its rightful place, all may be well; but if Irina takes it to its origin, she'll gain powers that could endanger the West. Aging professor and young buck join forces with a woman from Jones' past to face the dangers of the jungle, Russia, and the supernatural.", R.drawable.ijskull_cover));

        {
            ArrayList<Integer> photoShots = new ArrayList<>();
            photoShots.add(R.drawable.ff_scr1);
            photoShots.add(R.drawable.ff_scr2);
            photoShots.add(R.drawable.ff_scr3);
            photoShots.add(R.drawable.ff_scr4);
            models.get(0).setPhotosShots(photoShots);

            ArrayList<RoleModel> roles = new ArrayList<>();
            roles.add(new RoleModel(new ActorModel("Vin", "Diesel", R.drawable.vin_diesel), "Dom"));
            roles.add(new RoleModel(new ActorModel("Jason", "Statham", R.drawable.jason_statham), "Deckard"));
            roles.add(new RoleModel(new ActorModel("Dwayne", "Johnson", R.drawable.dwayne_rock2), "Hobbs"));
            roles.add(new RoleModel(new ActorModel("Ludacris", "", R.drawable.ludacris), "Tej Parker"));
            models.get(0).setRoleModels(roles);
        }

        {
            ArrayList<Integer> photoShots = new ArrayList<>();
            photoShots.add(R.drawable.shrek2_scr1);
            photoShots.add(R.drawable.shrek2_scr2);
            photoShots.add(R.drawable.shrek2_scr3);
            photoShots.add(R.drawable.shrek2_scr4);
            models.get(1).setPhotosShots(photoShots);

            ArrayList<RoleModel> roles = new ArrayList<>();
            roles.add(new RoleModel(new ActorModel("Mike", "Meyers", R.drawable.mike_meyers), "Shrek"));
            roles.add(new RoleModel(new ActorModel("Eddie", "Murphy", R.drawable.eddit_murphy), "Donkey"));
            roles.add(new RoleModel(new ActorModel("Cameron", "Diaz", R.drawable.cameron_diaz), "Fiona"));
            roles.add(new RoleModel(new ActorModel("Julie", "Andrews", R.drawable.julie_andrews), "Queen"));
            roles.add(new RoleModel(new ActorModel("Antonio", "Banderas", R.drawable.antonio_banderas), "Puss In Boots"));
            models.get(1).setRoleModels(roles);
        }

        {
            ArrayList<Integer> photoShots = new ArrayList<>();
            photoShots.add(R.drawable.gd_scr1);
            photoShots.add(R.drawable.gd_scr2);
            photoShots.add(R.drawable.gd_scr3);
            photoShots.add(R.drawable.gd_scr4);
            photoShots.add(R.drawable.gd_scr5);
            models.get(2).setPhotosShots(photoShots);

            ArrayList<RoleModel> roles = new ArrayList<>();
            roles.add(new RoleModel(new ActorModel("Russell", "Crowe", R.drawable.russell_crowe), "Maximus"));
            roles.add(new RoleModel(new ActorModel("Joaquin", "Phoenix", R.drawable.joaquin_phoenix), "Commodus"));
            roles.add(new RoleModel(new ActorModel("Connie", "Nielsen", R.drawable.connie_nelsen), "Lucilla"));
            roles.add(new RoleModel(new ActorModel("Olivier", "Reed", R.drawable.oliver_reed), "Proximo"));
            models.get(2).setRoleModels(roles);
        }

        {
            ArrayList<Integer> photoShots = new ArrayList<>();
            photoShots.add(R.drawable.ij_scr1);
            photoShots.add(R.drawable.ij_scr2);
            photoShots.add(R.drawable.ij_scr3);
            photoShots.add(R.drawable.ij_scr4);
            photoShots.add(R.drawable.ij_scr5);
            models.get(3).setPhotosShots(photoShots);

            ArrayList<RoleModel> roles = new ArrayList<>();
            roles.add(new RoleModel(new ActorModel("Harrison", "Ford", R.drawable.harrison_ford), "Indiana Jones"));
            roles.add(new RoleModel(new ActorModel("Cate", "Blanchet", R.drawable.kate_blanchet), "Irina Spalko"));
            roles.add(new RoleModel(new ActorModel("Karen", "Allen", R.drawable.karen_allen), "Marion Ravenwood"));
            roles.add(new RoleModel(new ActorModel("Shia", "LaBeouf", R.drawable.shia_labeouf), "Mutt Williams"));
            models.get(3).setRoleModels(roles);
        }
        return models;
    }
}
