package jparanoia.server;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JButton;

class CombatButton extends JButton {
    ServerPlayer player;

    public CombatButton( ServerPlayer paramServerPlayer ) {
        /* 468 */
        super( paramServerPlayer.toString() );

        /* 470 */
        this.player = paramServerPlayer;


        /* 473 */
        setText( this.player.getName() );
        /* 474 */
        setPreferredSize( new Dimension( 110, 24 ) );
        /* 475 */
        setMinimumSize( new Dimension( 110, 24 ) );
        /* 476 */
        setMaximumSize( new Dimension( 110, 24 ) );
        /* 477 */
        setMargin( new Insets( 2, 2, 2, 2 ) );
    }
}


/* Location:              C:\Users\noahc\Desktop\JParanoia(1.31.1)\JParanoia(1.31.1).jar!\jparanoia\server\CombatButton.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       0.7.1
 */
