package theGartic.cards;

import com.badlogic.gdx.graphics.Color;
import com.evacipated.cardcrawl.mod.stslib.patches.FlavorText;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import theGartic.powers.CelestialCraftingPower;

import static theGartic.GarticMod.makeID;
import static theGartic.util.Wiz.applyToSelf;

public class CelestialCrafting extends AbstractEasyCard {
    public final static String ID = makeID(CelestialCrafting.class.getSimpleName());
    private final static int COST = 2;
    private final static int MAGIC = 1;

    public CelestialCrafting() {
        super(ID, COST, CardType.POWER, CardRarity.UNCOMMON, CardTarget.SELF);
        baseMagicNumber = magicNumber = MAGIC;
        FlavorText.AbstractCardFlavorFields.boxColor.set(this, new Color(1.0f, 0.25f, 0.25f, 1.0f));
    }

    public void use(AbstractPlayer p, AbstractMonster m) {
        applyToSelf(new CelestialCraftingPower(magicNumber));
    }

    @Override
    public boolean canUpgrade() {
        return false;
    }

    public void upp() {
    }
}