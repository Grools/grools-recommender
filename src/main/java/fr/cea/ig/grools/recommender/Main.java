package fr.cea.ig.grools.recommender;

import fr.cea.ig.grools.reasoner.Reasoner;
import librec.main.LibRec;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jmercier on 21/08/16.
 */

public class Main {
    
    public static void main( String[] args ) {
        final LibRec         librec    = new LibRec();
        final List<Reasoner> reasoners = Arrays.stream( args )
                                               .map( File::new )
                                               .map( Reasoner::load )
                                               .collect( Collectors.toList( ) );
    }
}
