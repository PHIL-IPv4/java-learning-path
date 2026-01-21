package Tag16;

public class TestSpellccaster {
    public static void main(String[] args) {
        Spellcaster spellcaster = new Spellcaster();
        Sorcerer sorcerer = new Sorcerer();
        Wizard wizard = new Wizard();
        WildMagicSorcerer wildMagicSorcerer = new WildMagicSorcerer();
        IllusionWizard illusionWizard = new IllusionWizard();

        System.out.println("Spellcaster: ");
        spellcaster.castSpell();
        System.out.println("Sorcerer: ");
        sorcerer.castSpell();
        System.out.println("Wizard: ");
        wizard.castSpell();
        System.out.println("WildMagicSorcerer: ");
        wildMagicSorcerer.castSpell();
        System.out.println("IllusionWizard: ");
        illusionWizard.castSpell();
    }
}
