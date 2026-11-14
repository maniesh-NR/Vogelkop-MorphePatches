package com.leanplum;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public interface DeferredActivitiesStrategy {

    public static class BlacklistStrategy implements DeferredActivitiesStrategy {

        @Nullable
        private Set<Class> mBlacklistedActivities;

        private BlacklistStrategy(@NonNull Class[] clsArr) {
            if (clsArr.length == 0) {
                return;
            }
            HashSet hashSet = new HashSet();
            this.mBlacklistedActivities = hashSet;
            hashSet.addAll(Arrays.asList(clsArr));
        }

        @NonNull
        public static BlacklistStrategy create(@NonNull Class... clsArr) {
            return new BlacklistStrategy(clsArr);
        }

        @Override // com.leanplum.DeferredActivitiesStrategy
        public boolean isActivityClassIgnored(@NonNull Class cls) {
            Set<Class> set = this.mBlacklistedActivities;
            return set != null && set.contains(cls);
        }
    }

    public static class WhitelistStrategy implements DeferredActivitiesStrategy {

        @Nullable
        private Set<Class> mWhitelistedActivities;

        private WhitelistStrategy(@NonNull Class[] clsArr) {
            if (clsArr.length == 0) {
                return;
            }
            HashSet hashSet = new HashSet();
            this.mWhitelistedActivities = hashSet;
            hashSet.addAll(Arrays.asList(clsArr));
        }

        @NonNull
        public static WhitelistStrategy create(@NonNull Class... clsArr) {
            return new WhitelistStrategy(clsArr);
        }

        @Override // com.leanplum.DeferredActivitiesStrategy
        public boolean isActivityClassIgnored(@NonNull Class cls) {
            Set<Class> set = this.mWhitelistedActivities;
            return set == null || !set.contains(cls);
        }
    }

    boolean isActivityClassIgnored(@NonNull Class cls);
}
