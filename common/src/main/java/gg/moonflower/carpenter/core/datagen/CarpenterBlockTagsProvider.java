package gg.moonflower.carpenter.core.datagen;

import gg.moonflower.carpenter.core.registry.CarpenterBlocks;
import gg.moonflower.carpenter.core.registry.CarpenterTags;
import gg.moonflower.pollen.api.datagen.provider.tags.PollinatedBlockTagsProvider;
import gg.moonflower.pollen.api.util.PollinatedModContainer;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;

public class CarpenterBlockTagsProvider extends PollinatedBlockTagsProvider {
    public CarpenterBlockTagsProvider(DataGenerator dataGenerator, PollinatedModContainer container) {
        super(dataGenerator, container);
    }

    @Override
    protected void addTags() {
        this.tag(CarpenterTags.BOOKSHELVES)
                .add(CarpenterBlocks.SPRUCE_BOOKSHELF.get())
                .add(CarpenterBlocks.BIRCH_BOOKSHELF.get())
                .add(CarpenterBlocks.JUNGLE_BOOKSHELF.get())
                .add(CarpenterBlocks.ACACIA_BOOKSHELF.get())
                .add(CarpenterBlocks.DARK_OAK_BOOKSHELF.get())
                .add(CarpenterBlocks.CRIMSON_BOOKSHELF.get())
                .add(CarpenterBlocks.WARPED_BOOKSHELF.get());
        this.tag(BlockTags.MINEABLE_WITH_AXE).addTag(CarpenterTags.BOOKSHELVES);

        this.tag(CarpenterTags.CHESTS)
                .add(CarpenterBlocks.SPRUCE_CHEST.get())
                .add(CarpenterBlocks.BIRCH_CHEST.get())
                .add(CarpenterBlocks.ACACIA_CHEST.get())
                .add(CarpenterBlocks.DARK_OAK_CHEST.get())
                .add(CarpenterBlocks.CRIMSON_CHEST.get())
                .add(CarpenterBlocks.WARPED_CHEST.get());
        this.tag(BlockTags.MINEABLE_WITH_AXE).addTag(CarpenterTags.CHESTS);
    }
}
