package com.leoregulus.eclosion.tag;

import com.leoregulus.eclosion.Eclosion;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {

    public static final TagKey<Item> SUGAR_TAG = bind("sugar_tag");

    private static TagKey<Item> bind(String pName) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Eclosion.MOD_ID, pName));
    }
}
