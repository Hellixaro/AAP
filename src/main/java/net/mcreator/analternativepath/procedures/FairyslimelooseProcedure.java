package net.mcreator.analternativepath.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

public class FairyslimelooseProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double particleRadius = 0;
		double particleAmount = 0;
		if (Math.random() < 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Allay(EntityType.ALLAY, _level);
				entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
