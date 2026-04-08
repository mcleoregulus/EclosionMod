package com.leoregulus.eclosion.datagen;

import com.leoregulus.eclosion.Eclosion;
import com.leoregulus.eclosion.item.ModItems;
import com.leoregulus.eclosion.tag.ModItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, Eclosion.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        tag(ModItemTags.SUGAR_TAG)
                .add(Items.BEETROOT)
                .add(ModItems.STRAWBERRY.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.ICE_ETHER_HELMET.get(),
                        ModItems.ICE_ETHER_CHESTPLATE.get(),
                        ModItems.ICE_ETHER_LEGGINGS.get(),
                        ModItems.ICE_ETHER_BOOTS.get());
    }
}
