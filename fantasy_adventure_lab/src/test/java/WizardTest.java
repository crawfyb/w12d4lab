import characters.Wizard;
import items.Armour;
import items.Pet;
import items.Spell;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void setUp() {
        wizard = new Wizard(100, "Gav the Wizard", Spell.AVAKEDABRA, Pet.GRIFFIN);
    }

    @Test
    public void canGetPet() {
        assertEquals(Pet.GRIFFIN, wizard.getPet());
    }

    @Test
    public void canGetName() {
        assertEquals("Gav the Wizard", wizard.getName());
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void canSetSpell() {
        wizard.setSpell(Spell.AVAKEDABRA);
        assertEquals(Spell.AVAKEDABRA, wizard.getSpell());
    }

    @Test
    public void canTakeDamage() {
        wizard.defend(60);
        assertEquals(90, wizard.getHealth());
        wizard.defend(10);
        assertEquals(90, wizard.getHealth());
    }

    @Test
    public void canSpell() {
        wizard.castSpell(wizard, Spell.AVAKEDABRA.getDamage());
        assertEquals(90, wizard.getHealth());


    }

}
