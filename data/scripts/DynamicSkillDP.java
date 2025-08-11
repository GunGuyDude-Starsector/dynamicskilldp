package data.scripts;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.impl.campaign.skills.BaseSkillEffectDescription;

public class DynamicSkillDP extends BaseModPlugin {

    public static float BASE_VALUE = 240f;
    public static float BASE_MAX_BATTLE_SIZE = 400f;

    public static float FIGHTER_BAYS_THRESHOLD = (float) Math.floor(BASE_VALUE / 30f);
    public static float OP_THRESHOLD = (float) Math.floor(BASE_VALUE);
	public static float OP_LOW_THRESHOLD = (float) Math.floor(BASE_VALUE / 2f);
	public static float OP_ALL_LOW_THRESHOLD = (float) Math.floor(BASE_VALUE / 2f);
	public static float OP_ALL_THRESHOLD = (float) Math.floor(BASE_VALUE);
	public static float PHASE_OP_THRESHOLD = (float) Math.floor(BASE_VALUE / 6f);
	public static float MILITARIZED_OP_THRESHOLD = (float) Math.floor(BASE_VALUE / 48f);
	public static float AUTOMATED_POINTS_THRESHOLD = (float) Math.floor(BASE_VALUE / 2f);

    @Override
    public void onApplicationLoad() {
        float battleSize = (float) Global.getSettings().getBattleSize();
        float multiplier = battleSize / BASE_MAX_BATTLE_SIZE;

        BaseSkillEffectDescription.FIGHTER_BAYS_THRESHOLD = FIGHTER_BAYS_THRESHOLD * multiplier;
        BaseSkillEffectDescription.OP_THRESHOLD = OP_THRESHOLD * multiplier;
        BaseSkillEffectDescription.OP_LOW_THRESHOLD = OP_LOW_THRESHOLD * multiplier;
        BaseSkillEffectDescription.OP_ALL_LOW_THRESHOLD = OP_ALL_LOW_THRESHOLD * multiplier;
        BaseSkillEffectDescription.OP_ALL_THRESHOLD = OP_ALL_THRESHOLD * multiplier;
        BaseSkillEffectDescription.PHASE_OP_THRESHOLD = PHASE_OP_THRESHOLD * multiplier;
        BaseSkillEffectDescription.MILITARIZED_OP_THRESHOLD = MILITARIZED_OP_THRESHOLD * multiplier;
        BaseSkillEffectDescription.AUTOMATED_POINTS_THRESHOLD = AUTOMATED_POINTS_THRESHOLD * multiplier;
    }
}