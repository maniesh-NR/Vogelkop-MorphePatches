package com.leanplum.messagetemplates;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.messagetemplates.OperaSheetRequest;
import defpackage.b2l;
import defpackage.cej;
import defpackage.d7l;
import defpackage.dej;
import defpackage.gg0;
import defpackage.ijm;
import defpackage.k9c;
import defpackage.mej;
import defpackage.orm;
import defpackage.s8n;
import defpackage.sj0;
import defpackage.skm;
import defpackage.tah;
import defpackage.vb0;
import defpackage.vq3;
import defpackage.x5f;
import defpackage.xn0;
import defpackage.xnf;
import defpackage.y6f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0003\u001c\u001d\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/leanplum/messagetemplates/OperaSheetRequest;", "Lcej;", "Lcom/leanplum/messagetemplates/OperaSheetRequest$Model;", "model", "Lorm;", "usageReporter", "Lskm;", "unfilteredUsageReporter", "<init>", "(Lcom/leanplum/messagetemplates/OperaSheetRequest$Model;Lorm;Lskm;)V", "Lmej;", "sheetHost", "Lb2l;", "tab", "Ldej;", "createSheet", "(Lmej;Lb2l;)Ldej;", "Landroid/content/Context;", "context", "createSheetHost", "(Landroid/content/Context;)Lmej;", "activeTab", "", "isAllowed", "(Lb2l;)Z", "Lcom/leanplum/messagetemplates/OperaSheetRequest$Model;", "Lorm;", "Lskm;", "SheetType", "Model", "Button", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaSheetRequest extends cej {
    public static final int $stable = 8;

    @NotNull
    private final Model model;

    @NotNull
    private final skm unfilteredUsageReporter;

    @NotNull
    private final orm usageReporter;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\u0006\u0010\u0014\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\n¢\u0006\u0002\n\u0000R\u0015\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\u0002\b\n¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\u0002\b\n¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0015"}, d2 = {"Lcom/leanplum/messagetemplates/OperaSheetRequest$Button;", "", "label", "", "action", "Ljava/lang/Runnable;", "promoUrl", "Landroid/net/Uri;", "<init>", "(Ljava/lang/String;Ljava/lang/Runnable;Landroid/net/Uri;)V", "Lkotlin/jvm/JvmField;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Button {
        public static final int $stable = 8;

        @NotNull
        public final Runnable action;

        @NotNull
        public final String label;
        public final Uri promoUrl;

        public Button(@NotNull String str, @NotNull Runnable runnable, Uri uri) {
            this.label = str;
            this.action = runnable;
            this.promoUrl = uri;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, Runnable runnable, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                str = button.label;
            }
            if ((i & 2) != 0) {
                runnable = button.action;
            }
            if ((i & 4) != 0) {
                uri = button.promoUrl;
            }
            return button.copy(str, runnable, uri);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Runnable getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final Uri getPromoUrl() {
            return this.promoUrl;
        }

        @NotNull
        public final Button copy(@NotNull String label, @NotNull Runnable action, Uri promoUrl) {
            return new Button(label, action, promoUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.a(this.label, button.label) && Intrinsics.a(this.action, button.action) && Intrinsics.a(this.promoUrl, button.promoUrl);
        }

        public int hashCode() {
            int iHashCode = (this.action.hashCode() + (this.label.hashCode() * 31)) * 31;
            Uri uri = this.promoUrl;
            return iHashCode + (uri == null ? 0 : uri.hashCode());
        }

        @NotNull
        public final String toString() {
            return "";
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\fHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000eHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ji\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004J\u0006\u0010\"\u001a\u00020\u0005R\u0015\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013¢\u0006\u0002\n\u0000R\u0015\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013¢\u0006\u0002\n\u0000R\u0015\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013¢\u0006\u0002\n\u0000R\u0015\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013¢\u0006\u0002\n\u0000R\u0015\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013¢\u0006\u0002\n\u0000R\u0015\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0013¢\u0006\u0002\n\u0000Ê\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0000¨\u0006#"}, d2 = {"Lcom/leanplum/messagetemplates/OperaSheetRequest$Model;", "", Constants.Params.TYPE, "Lcom/leanplum/messagetemplates/OperaSheetRequest$SheetType;", "id", "", "title", Constants.Params.MESSAGE, "primaryButton", "Lcom/leanplum/messagetemplates/OperaSheetRequest$Button;", "secondaryButton", "resourceWrapper", "Lcom/leanplum/messagetemplates/ResourceWrapper;", "fullWidthButtons", "", "closeButtonAction", "Ljava/lang/Runnable;", "<init>", "(Lcom/leanplum/messagetemplates/OperaSheetRequest$SheetType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/leanplum/messagetemplates/OperaSheetRequest$Button;Lcom/leanplum/messagetemplates/OperaSheetRequest$Button;Lcom/leanplum/messagetemplates/ResourceWrapper;ZLjava/lang/Runnable;)V", "Lkotlin/jvm/JvmField;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Model {
        public static final int $stable = 8;
        public final Runnable closeButtonAction;
        public final boolean fullWidthButtons;

        @NotNull
        public final String id;

        @NotNull
        public final String message;
        public final Button primaryButton;

        @NotNull
        public final ResourceWrapper resourceWrapper;
        public final Button secondaryButton;

        @NotNull
        public final String title;

        @NotNull
        public final SheetType type;

        public Model(@NotNull SheetType sheetType, @NotNull String str, @NotNull String str2, @NotNull String str3, Button button, Button button2, @NotNull ResourceWrapper resourceWrapper, boolean z, Runnable runnable) {
            this.type = sheetType;
            this.id = str;
            this.title = str2;
            this.message = str3;
            this.primaryButton = button;
            this.secondaryButton = button2;
            this.resourceWrapper = resourceWrapper;
            this.fullWidthButtons = z;
            this.closeButtonAction = runnable;
        }

        public static /* synthetic */ Model copy$default(Model model, SheetType sheetType, String str, String str2, String str3, Button button, Button button2, ResourceWrapper resourceWrapper, boolean z, Runnable runnable, int i, Object obj) {
            if ((i & 1) != 0) {
                sheetType = model.type;
            }
            if ((i & 2) != 0) {
                str = model.id;
            }
            if ((i & 4) != 0) {
                str2 = model.title;
            }
            if ((i & 8) != 0) {
                str3 = model.message;
            }
            if ((i & 16) != 0) {
                button = model.primaryButton;
            }
            if ((i & 32) != 0) {
                button2 = model.secondaryButton;
            }
            if ((i & 64) != 0) {
                resourceWrapper = model.resourceWrapper;
            }
            if ((i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) != 0) {
                z = model.fullWidthButtons;
            }
            if ((i & Constants.Crypt.KEY_LENGTH) != 0) {
                runnable = model.closeButtonAction;
            }
            boolean z2 = z;
            Runnable runnable2 = runnable;
            Button button3 = button2;
            ResourceWrapper resourceWrapper2 = resourceWrapper;
            Button button4 = button;
            String str4 = str2;
            return model.copy(sheetType, str, str4, str3, button4, button3, resourceWrapper2, z2, runnable2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final SheetType getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component5, reason: from getter */
        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        /* renamed from: component6, reason: from getter */
        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final ResourceWrapper getResourceWrapper() {
            return this.resourceWrapper;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getFullWidthButtons() {
            return this.fullWidthButtons;
        }

        /* renamed from: component9, reason: from getter */
        public final Runnable getCloseButtonAction() {
            return this.closeButtonAction;
        }

        @NotNull
        public final Model copy(@NotNull SheetType type, @NotNull String id, @NotNull String title, @NotNull String message, Button primaryButton, Button secondaryButton, @NotNull ResourceWrapper resourceWrapper, boolean fullWidthButtons, Runnable closeButtonAction) {
            return new Model(type, id, title, message, primaryButton, secondaryButton, resourceWrapper, fullWidthButtons, closeButtonAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Model)) {
                return false;
            }
            Model model = (Model) other;
            return this.type == model.type && Intrinsics.a(this.id, model.id) && Intrinsics.a(this.title, model.title) && Intrinsics.a(this.message, model.message) && Intrinsics.a(this.primaryButton, model.primaryButton) && Intrinsics.a(this.secondaryButton, model.secondaryButton) && Intrinsics.a(this.resourceWrapper, model.resourceWrapper) && this.fullWidthButtons == model.fullWidthButtons && Intrinsics.a(this.closeButtonAction, model.closeButtonAction);
        }

        public int hashCode() {
            int iF = z1m.f(z1m.f(z1m.f(this.type.hashCode() * 31, 31, this.id), 31, this.title), 31, this.message);
            Button button = this.primaryButton;
            int iHashCode = (iF + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.secondaryButton;
            int iK = fki.k((this.resourceWrapper.hashCode() + ((iHashCode + (button2 == null ? 0 : button2.hashCode())) * 31)) * 31, 31, this.fullWidthButtons);
            Runnable runnable = this.closeButtonAction;
            return iK + (runnable != null ? runnable.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/leanplum/messagetemplates/OperaSheetRequest$SheetType;", "", "Lgg0;", "aggroType", "<init>", "(Ljava/lang/String;ILgg0;)V", "Lgg0;", "getAggroType", "()Lgg0;", "OPERA_SHEET", "SUBSCRIPTION_SHEET", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SheetType {
        private static final /* synthetic */ g58 $ENTRIES;
        private static final /* synthetic */ SheetType[] $VALUES;
        public static final SheetType OPERA_SHEET = new SheetType("OPERA_SHEET", 0, gg0.d);
        public static final SheetType SUBSCRIPTION_SHEET = new SheetType("SUBSCRIPTION_SHEET", 1, gg0.e);

        @NotNull
        private final gg0 aggroType;

        private static final /* synthetic */ SheetType[] $values() {
            return new SheetType[]{OPERA_SHEET, SUBSCRIPTION_SHEET};
        }

        static {
            SheetType[] sheetTypeArr$values = $values();
            $VALUES = sheetTypeArr$values;
            $ENTRIES = new h58(sheetTypeArr$values);
        }

        private SheetType(String str, int i, gg0 gg0Var) {
            this.aggroType = gg0Var;
        }

        @NotNull
        public static g58 getEntries() {
            return $ENTRIES;
        }

        public static SheetType valueOf(String str) {
            return (SheetType) Enum.valueOf(SheetType.class, str);
        }

        public static SheetType[] values() {
            return (SheetType[]) $VALUES.clone();
        }

        @NotNull
        public final gg0 getAggroType() {
            return this.aggroType;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 1328)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetType.values().length];
            try {
                iArr[SheetType.OPERA_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetType.SUBSCRIPTION_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OperaSheetRequest(@NotNull Model model, @NotNull orm ormVar, @NotNull skm skmVar) {
        this.model = model;
        this.usageReporter = ormVar;
        this.unfilteredUsageReporter = skmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSheet$lambda$1(OperaSheetRequest operaSheetRequest, oqh oqhVar, k9c k9cVar) {
        orm ormVar = operaSheetRequest.usageReporter;
        gg0 aggroType = operaSheetRequest.model.type.getAggroType();
        long j = oqhVar.a;
        Model model = operaSheetRequest.model;
        ((x5f) ormVar).Y(aggroType, vb0.b, j, model.resourceWrapper.status, model.id);
        Model model2 = operaSheetRequest.model;
        Uri uri = model2.primaryButton.promoUrl;
        if (uri != null) {
            ((x5f) operaSheetRequest.unfilteredUsageReporter).o0(model2.id, uri, sj0.c, xn0.b);
        }
        operaSheetRequest.model.primaryButton.action.run();
        k9cVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSheet$lambda$3(OperaSheetRequest operaSheetRequest, oqh oqhVar, k9c k9cVar) {
        orm ormVar = operaSheetRequest.usageReporter;
        gg0 aggroType = operaSheetRequest.model.type.getAggroType();
        long j = oqhVar.a;
        Model model = operaSheetRequest.model;
        ((x5f) ormVar).Y(aggroType, vb0.c, j, model.resourceWrapper.status, model.id);
        Model model2 = operaSheetRequest.model;
        Uri uri = model2.secondaryButton.promoUrl;
        if (uri != null) {
            ((x5f) operaSheetRequest.unfilteredUsageReporter).o0(model2.id, uri, sj0.c, xn0.b);
        }
        operaSheetRequest.model.secondaryButton.action.run();
        k9cVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSheet$lambda$4(OperaSheetRequest operaSheetRequest, oqh oqhVar, k9c k9cVar) {
        orm ormVar = operaSheetRequest.usageReporter;
        gg0 aggroType = operaSheetRequest.model.type.getAggroType();
        long j = oqhVar.a;
        Model model = operaSheetRequest.model;
        ((x5f) ormVar).Y(aggroType, vb0.c, j, model.resourceWrapper.status, model.id);
        operaSheetRequest.model.closeButtonAction.run();
        k9cVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSheet$lambda$5(OperaSheetRequest operaSheetRequest, oqh oqhVar, hjm hjmVar) {
        if (hjmVar == hjm.b) {
            orm ormVar = operaSheetRequest.usageReporter;
            gg0 aggroType = operaSheetRequest.model.type.getAggroType();
            long j = oqhVar.a;
            Model model = operaSheetRequest.model;
            ((x5f) ormVar).Y(aggroType, vb0.d, j, model.resourceWrapper.status, model.id);
        }
    }

    @Override // defpackage.cej
    @NotNull
    public dej createSheet(@NotNull mej sheetHost, b2l tab) {
        tah tahVar = new tah((byte) 6);
        final oqh oqhVar = new oqh();
        Model model = this.model;
        Button button = model.primaryButton;
        if (button != null) {
            oqhVar.a++;
        }
        if (model.secondaryButton != null) {
            oqhVar.a++;
        }
        if (model.closeButtonAction != null) {
            oqhVar.a++;
        }
        tahVar.b = model.title;
        tahVar.e = model.message;
        ResourceWrapper resourceWrapper = model.resourceWrapper;
        p2d p2dVar = resourceWrapper.lottieComposition;
        if (p2dVar != null) {
            tahVar.d = p2dVar;
        } else {
            tahVar.c = resourceWrapper.image;
        }
        xn0 xn0Var = xn0.f;
        sj0 sj0Var = sj0.c;
        if (button != null) {
            Uri uri = button.promoUrl;
            if (uri != null) {
                ((x5f) this.unfilteredUsageReporter).o0(model.id, uri, sj0Var, xn0Var);
            }
            model = this.model;
            String str = model.primaryButton.label;
            xnf xnfVar = new xnf(this, oqhVar, (byte) 0);
            tahVar.h = str;
            tahVar.i = xnfVar;
        }
        Button button2 = model.secondaryButton;
        if (button2 != null) {
            Uri uri2 = button2.promoUrl;
            if (uri2 != null) {
                ((x5f) this.unfilteredUsageReporter).o0(model.id, uri2, sj0Var, xn0Var);
            }
            model = this.model;
            String str2 = model.secondaryButton.label;
            xnf xnfVar2 = new xnf(this, oqhVar, (byte) 1);
            tahVar.f = str2;
            tahVar.g = xnfVar2;
        }
        if (model.closeButtonAction != null) {
            tahVar.k = new xnf(this, oqhVar, (byte) 2);
        }
        tahVar.j = new y6f() { // from class: ynf
            @Override // defpackage.y6f
            public final void a(hjm hjmVar) {
                OperaSheetRequest.createSheet$lambda$5(this.a, oqhVar, hjmVar);
            }
        };
        return new k9c(sheetHost, tahVar);
    }

    @Override // defpackage.cej
    @NotNull
    public mej createSheetHost(@NotNull Context context) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.model.type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                h9o.p();
                return null;
            }
            context = new s8n(context, 2130970594);
        }
        return new vq3(context, this.model.fullWidthButtons ? 2132083100 : 0, true);
    }

    @Override // defpackage.jjm
    @NonNull
    public /* bridge */ /* synthetic */ ijm getDefaultPriority() {
        return ijm.b;
    }

    @Override // defpackage.cej
    public boolean isAllowed(b2l activeTab) {
        return activeTab == null || !((d7l) activeTab).j.m();
    }
}
