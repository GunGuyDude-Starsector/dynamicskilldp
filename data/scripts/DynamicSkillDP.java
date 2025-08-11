package dynamicskilldp;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.impl.campaign.skills.BaseSkillEffectDescription;

public class DynamicSkillDP extends BaseModPlugin {

    public static float BASE_VALUE = 240f;

    public static float FIGHTER_BAYS_THRESHOLD = (float) Math.floor(BASE_VALUE / 30);
    public static float OP_THRESHOLD = (float) Math.floor(BASE_VALUE);
	public static float OP_LOW_THRESHOLD = (float) Math.floor(BASE_VALUE / 2);
	public static float OP_ALL_LOW_THRESHOLD = (float) Math.floor(BASE_VALUE / 2);
	public static float OP_ALL_THRESHOLD = (float) Math.floor(BASE_VALUE);
	public static float PHASE_OP_THRESHOLD = (float) Math.floor(BASE_VALUE / 6);
	public static float MILITARIZED_OP_THRESHOLD = (float) Math.floor(BASE_VALUE / 48);
	public static float AUTOMATED_POINTS_THRESHOLD = (float) Math.floor(BASE_VALUE / 2);

    @Override
    public void onGameLoad() {
        int battleSize = Global.getSettings.getBattleSize();
        float multiplier = battleSize / BASE_VALUE;

        BaseSkillEffectDescription.FIGHTER_BAYS_THRESHOLD = FIGHTER_BAYS_THRESHOLD * multiplier;
        BaseSkillEffectDescription.OP_THRESHOLD = OP_THRESHOLD * multiplier;
        BaseSkillEffectDescription.OP_LOW_THRESHOLD = OP_LOW_THRESHOLD * multiplier;
        BaseSkillEffectDescription.OP_ALL_LOW_THRESHOLD = OP_ALL_LOW_THRESHOLD * multiplier;
        BaseSkillEffectDescription.OP_ALL_THRESHOLD = OP_ALL_THRESHOLD * multiplier;
        BaseSkillEffectDescription.PHASE_OP_THRESHOLD = PHASE_OP_THRESHOLD * multiplier;
        BaseSkillEffectDescription.MILITARIZED_OP_THRESHOLD = MILITARIZED_OP_THRESHOLD * multiplier;
        BaseSkillEffectDescription.AUTOMATED_POINTS_THRESHOLD = AUTOMATED_POINTS_THRESHOLD * multiplier;

        // Modify skills for less immediate impact but same long-term value.
        /*
        BulkTransport.CARGO_CAPACITY_THRESHOLD = 4000;
        BulkTransport.FUEL_CAPACITY_THRESHOLD = 4000;
        BulkTransport.PERSONNEL_CAPACITY_THRESHOLD = 10000;
        BulkTransport.CARGO_CAPACITY_MAX_PERCENT = 20;
        BulkTransport.FUEL_CAPACITY_MAX_PERCENT = 20;
        BulkTransport.PERSONNEL_CAPACITY_MAX_PERCENT = 20;
        MakeshiftEquipment.SUPPLY_USE_REDUCTION_MAX_PERCENT = 25;
        ContainmentProcedures.FUEL_USE_REDUCTION_MAX_PERCENT = 25;
        Sensors.SENSOR_BONUS = 100.0F;
        OfficerManagement.NUM_OFFICERS_BONUS = 3.0F;
        */
    }
}