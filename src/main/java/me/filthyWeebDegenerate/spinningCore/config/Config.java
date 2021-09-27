package me.filthyWeebDegenerate.spinningCore.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class Config {
    public static ForgeConfigSpec CLIENT_CONFIG;
    public static ForgeConfigSpec SERVER_CONFIG;

    private static ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
    private static ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

    public static ForgeConfigSpec.IntValue ENERGY_PRODUCTION_MULTIPLIER;

    public static ForgeConfigSpec.BooleanValue IS_COOL;

    public static void init() {
        initServer();
        initClient();

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, SERVER_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CLIENT_CONFIG);
    }

    private static void initServer() {


        SERVER_BUILDER.comment("Energy production settings");
        ENERGY_PRODUCTION_MULTIPLIER = SERVER_BUILDER.comment("A multiplier for energy production").defineInRange("energyProductionMultiplier", 1, 0, Integer.MAX_VALUE);

        buildServer();
    }

    private static void buildServer() {
        SERVER_CONFIG = SERVER_BUILDER.build();
    }

    private static void buildClient() {
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }

    private static void initClient() {


        IS_COOL = CLIENT_BUILDER.comment("Are you cool").define("isCool", false);

        buildClient();
    }
}
