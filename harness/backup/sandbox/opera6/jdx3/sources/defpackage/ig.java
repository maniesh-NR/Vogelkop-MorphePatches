package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ig implements Runnable, hh4 {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ ig() {
        this.a = (byte) 14;
    }

    public ig(gn3 gn3Var) {
        this.a = (byte) 12;
        Objects.requireNonNull(gn3Var);
        this.b = gn3Var;
    }

    public /* synthetic */ ig(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public ig(mm6 mm6Var, qim qimVar) {
        this.a = (byte) 19;
        this.b = qimVar;
    }

    public ig(ow7 ow7Var) {
        this.a = (byte) 24;
        Objects.requireNonNull(ow7Var);
        this.b = ow7Var;
    }

    @Override // defpackage.hh4
    public final void cancel() {
        this.b = null;
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getId()" because "imPostDom" is null
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:169)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Failed to build post-dominance tree
    java.lang.ArrayIndexOutOfBoundsException: Index 215 out of bounds for length 215
    	at jadx.core.dex.visitors.blocks.DominatorTree.build(DominatorTree.java:68)
    	at jadx.core.dex.visitors.blocks.PostDominatorTree.compute(PostDominatorTree.java:32)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:92)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
     */
    @Override // java.lang.Runnable
    public final void run() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig.run():void");
    }
}
