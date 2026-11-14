package com.leanplum.messagetemplates;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.opera.android.widget.LottieAnimationView;
import defpackage.dg0;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001e¨\u0006 "}, d2 = {"Lcom/leanplum/messagetemplates/ResourceWrapper;", "", "Landroid/graphics/Bitmap;", "image", "Lp2d;", "lottieComposition", "Ldg0;", "status", "<init>", "(Landroid/graphics/Bitmap;Lp2d;Ldg0;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Landroid/graphics/Bitmap;", "component2", "()Lp2d;", "component3", "()Ldg0;", "copy", "(Landroid/graphics/Bitmap;Lp2d;Ldg0;)Lcom/leanplum/messagetemplates/ResourceWrapper;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Bitmap;", "Lp2d;", "Ldg0;", "Companion", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ResourceWrapper {
    public final Bitmap image;
    public final p2d lottieComposition;

    @NotNull
    public final dg0 status;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final ResourceWrapper EMPTY = new ResourceWrapper(null, null, dg0.b);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007b\u0002\b\fJ\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002R\u0015\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0006¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/leanplum/messagetemplates/ResourceWrapper$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/leanplum/messagetemplates/ResourceWrapper;", "Lkotlin/jvm/JvmField;", "getResourceFromInputStream", "inputStream", "Ljava/io/InputStream;", "lottie", "", "Lkotlin/jvm/JvmStatic;", "getImageFromInputStream", "getLottieFromInputStream", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ResourceWrapper getImageFromInputStream(InputStream inputStream) {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
            return new ResourceWrapper(bitmapDecodeStream, null, bitmapDecodeStream == null ? dg0.e : dg0.c);
        }

        private final ResourceWrapper getLottieFromInputStream(InputStream inputStream) {
            p2d p2dVar = (p2d) u2d.c(inputStream, (String) null).a;
            return (p2dVar == null || !LottieAnimationView.r(p2dVar)) ? new ResourceWrapper(null, null, dg0.e) : new ResourceWrapper(null, p2dVar, dg0.f);
        }

        @NotNull
        public final ResourceWrapper getResourceFromInputStream(InputStream inputStream, boolean lottie) {
            if (inputStream == null) {
                return new ResourceWrapper(null, null, dg0.d);
            }
            try {
                return lottie ? getLottieFromInputStream(inputStream) : getImageFromInputStream(inputStream);
            } finally {
                xvg.l(inputStream);
            }
        }
    }

    public ResourceWrapper(Bitmap bitmap, p2d p2dVar, @NotNull dg0 dg0Var) {
        this.image = bitmap;
        this.lottieComposition = p2dVar;
        this.status = dg0Var;
    }

    public static /* synthetic */ ResourceWrapper copy$default(ResourceWrapper resourceWrapper, Bitmap bitmap, p2d p2dVar, dg0 dg0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = resourceWrapper.image;
        }
        if ((i & 2) != 0) {
            p2dVar = resourceWrapper.lottieComposition;
        }
        if ((i & 4) != 0) {
            dg0Var = resourceWrapper.status;
        }
        return resourceWrapper.copy(bitmap, p2dVar, dg0Var);
    }

    @NotNull
    public static final ResourceWrapper getResourceFromInputStream(InputStream inputStream, boolean z) {
        return INSTANCE.getResourceFromInputStream(inputStream, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final p2d getLottieComposition() {
        return this.lottieComposition;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final dg0 getStatus() {
        return this.status;
    }

    @NotNull
    public final ResourceWrapper copy(Bitmap image, p2d lottieComposition, @NotNull dg0 status) {
        return new ResourceWrapper(image, lottieComposition, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceWrapper)) {
            return false;
        }
        ResourceWrapper resourceWrapper = (ResourceWrapper) other;
        return Intrinsics.a(this.image, resourceWrapper.image) && Intrinsics.a(this.lottieComposition, resourceWrapper.lottieComposition) && Intrinsics.a(this.status, resourceWrapper.status);
    }

    public int hashCode() {
        Bitmap bitmap = this.image;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        p2d p2dVar = this.lottieComposition;
        return this.status.hashCode() + ((iHashCode + (p2dVar != null ? p2dVar.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "";
    }
}
