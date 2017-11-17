
package com.navin.retrofitexamplecode.model.listproduct;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result implements Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("is_dead")
    @Expose
    private Boolean isDead;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("tags")
    @Expose
    private String tags;
    @SerializedName("is_discontinued")
    @Expose
    private Boolean isDiscontinued;
    @SerializedName("price_in_cents")
    @Expose
    private Integer priceInCents;
    @SerializedName("regular_price_in_cents")
    @Expose
    private Integer regularPriceInCents;
    @SerializedName("limited_time_offer_savings_in_cents")
    @Expose
    private Integer limitedTimeOfferSavingsInCents;
    @SerializedName("limited_time_offer_ends_on")
    @Expose
    private Object limitedTimeOfferEndsOn;
    @SerializedName("bonus_reward_miles")
    @Expose
    private Integer bonusRewardMiles;
    @SerializedName("bonus_reward_miles_ends_on")
    @Expose
    private Object bonusRewardMilesEndsOn;
    @SerializedName("stock_type")
    @Expose
    private String stockType;
    @SerializedName("primary_category")
    @Expose
    private String primaryCategory;
    @SerializedName("secondary_category")
    @Expose
    private String secondaryCategory;
    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("package")
    @Expose
    private String _package;
    @SerializedName("package_unit_type")
    @Expose
    private String packageUnitType;
    @SerializedName("package_unit_volume_in_milliliters")
    @Expose
    private Integer packageUnitVolumeInMilliliters;
    @SerializedName("total_package_units")
    @Expose
    private Integer totalPackageUnits;
    @SerializedName("volume_in_milliliters")
    @Expose
    private Integer volumeInMilliliters;
    @SerializedName("alcohol_content")
    @Expose
    private Integer alcoholContent;
    @SerializedName("price_per_liter_of_alcohol_in_cents")
    @Expose
    private Integer pricePerLiterOfAlcoholInCents;
    @SerializedName("price_per_liter_in_cents")
    @Expose
    private Integer pricePerLiterInCents;
    @SerializedName("inventory_count")
    @Expose
    private Integer inventoryCount;
    @SerializedName("inventory_volume_in_milliliters")
    @Expose
    private Integer inventoryVolumeInMilliliters;
    @SerializedName("inventory_price_in_cents")
    @Expose
    private Integer inventoryPriceInCents;
    @SerializedName("sugar_content")
    @Expose
    private Object sugarContent;
    @SerializedName("producer_name")
    @Expose
    private String producerName;
    @SerializedName("released_on")
    @Expose
    private Object releasedOn;
    @SerializedName("has_value_added_promotion")
    @Expose
    private Boolean hasValueAddedPromotion;
    @SerializedName("has_limited_time_offer")
    @Expose
    private Boolean hasLimitedTimeOffer;
    @SerializedName("has_bonus_reward_miles")
    @Expose
    private Boolean hasBonusRewardMiles;
    @SerializedName("is_seasonal")
    @Expose
    private Boolean isSeasonal;
    @SerializedName("is_vqa")
    @Expose
    private Boolean isVqa;
    @SerializedName("is_ocb")
    @Expose
    private Boolean isOcb;
    @SerializedName("is_kosher")
    @Expose
    private Boolean isKosher;
    @SerializedName("value_added_promotion_description")
    @Expose
    private Object valueAddedPromotionDescription;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("serving_suggestion")
    @Expose
    private Object servingSuggestion;
    @SerializedName("tasting_note")
    @Expose
    private Object tastingNote;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("image_thumb_url")
    @Expose
    private String imageThumbUrl;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("varietal")
    @Expose
    private String varietal;
    @SerializedName("style")
    @Expose
    private String style;
    @SerializedName("tertiary_category")
    @Expose
    private String tertiaryCategory;
    @SerializedName("sugar_in_grams_per_liter")
    @Expose
    private Object sugarInGramsPerLiter;
    @SerializedName("clearance_sale_savings_in_cents")
    @Expose
    private Integer clearanceSaleSavingsInCents;
    @SerializedName("has_clearance_sale")
    @Expose
    private Boolean hasClearanceSale;
    @SerializedName("product_no")
    @Expose
    private Integer productNo;
    public final static Creator<Result> CREATOR = new Creator<Result>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Result createFromParcel(Parcel in) {
            return new Result(in);
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }

    }
    ;

    protected Result(Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.isDead = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.tags = ((String) in.readValue((String.class.getClassLoader())));
        this.isDiscontinued = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.priceInCents = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.regularPriceInCents = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.limitedTimeOfferSavingsInCents = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.limitedTimeOfferEndsOn = ((Object) in.readValue((Object.class.getClassLoader())));
        this.bonusRewardMiles = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.bonusRewardMilesEndsOn = ((Object) in.readValue((Object.class.getClassLoader())));
        this.stockType = ((String) in.readValue((String.class.getClassLoader())));
        this.primaryCategory = ((String) in.readValue((String.class.getClassLoader())));
        this.secondaryCategory = ((String) in.readValue((String.class.getClassLoader())));
        this.origin = ((String) in.readValue((String.class.getClassLoader())));
        this._package = ((String) in.readValue((String.class.getClassLoader())));
        this.packageUnitType = ((String) in.readValue((String.class.getClassLoader())));
        this.packageUnitVolumeInMilliliters = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.totalPackageUnits = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.volumeInMilliliters = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.alcoholContent = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.pricePerLiterOfAlcoholInCents = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.pricePerLiterInCents = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.inventoryCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.inventoryVolumeInMilliliters = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.inventoryPriceInCents = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.sugarContent = ((Object) in.readValue((Object.class.getClassLoader())));
        this.producerName = ((String) in.readValue((String.class.getClassLoader())));
        this.releasedOn = ((Object) in.readValue((Object.class.getClassLoader())));
        this.hasValueAddedPromotion = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.hasLimitedTimeOffer = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.hasBonusRewardMiles = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isSeasonal = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isVqa = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isOcb = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isKosher = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.valueAddedPromotionDescription = ((Object) in.readValue((Object.class.getClassLoader())));
        this.description = ((Object) in.readValue((Object.class.getClassLoader())));
        this.servingSuggestion = ((Object) in.readValue((Object.class.getClassLoader())));
        this.tastingNote = ((Object) in.readValue((Object.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.imageThumbUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.imageUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.varietal = ((String) in.readValue((String.class.getClassLoader())));
        this.style = ((String) in.readValue((String.class.getClassLoader())));
        this.tertiaryCategory = ((String) in.readValue((String.class.getClassLoader())));
        this.sugarInGramsPerLiter = ((Object) in.readValue((Object.class.getClassLoader())));
        this.clearanceSaleSavingsInCents = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.hasClearanceSale = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.productNo = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public Result() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsDead() {
        return isDead;
    }

    public void setIsDead(Boolean isDead) {
        this.isDead = isDead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Boolean getIsDiscontinued() {
        return isDiscontinued;
    }

    public void setIsDiscontinued(Boolean isDiscontinued) {
        this.isDiscontinued = isDiscontinued;
    }

    public Integer getPriceInCents() {
        return priceInCents;
    }

    public void setPriceInCents(Integer priceInCents) {
        this.priceInCents = priceInCents;
    }

    public Integer getRegularPriceInCents() {
        return regularPriceInCents;
    }

    public void setRegularPriceInCents(Integer regularPriceInCents) {
        this.regularPriceInCents = regularPriceInCents;
    }

    public Integer getLimitedTimeOfferSavingsInCents() {
        return limitedTimeOfferSavingsInCents;
    }

    public void setLimitedTimeOfferSavingsInCents(Integer limitedTimeOfferSavingsInCents) {
        this.limitedTimeOfferSavingsInCents = limitedTimeOfferSavingsInCents;
    }

    public Object getLimitedTimeOfferEndsOn() {
        return limitedTimeOfferEndsOn;
    }

    public void setLimitedTimeOfferEndsOn(Object limitedTimeOfferEndsOn) {
        this.limitedTimeOfferEndsOn = limitedTimeOfferEndsOn;
    }

    public Integer getBonusRewardMiles() {
        return bonusRewardMiles;
    }

    public void setBonusRewardMiles(Integer bonusRewardMiles) {
        this.bonusRewardMiles = bonusRewardMiles;
    }

    public Object getBonusRewardMilesEndsOn() {
        return bonusRewardMilesEndsOn;
    }

    public void setBonusRewardMilesEndsOn(Object bonusRewardMilesEndsOn) {
        this.bonusRewardMilesEndsOn = bonusRewardMilesEndsOn;
    }

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    public String getPrimaryCategory() {
        return primaryCategory;
    }

    public void setPrimaryCategory(String primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public String getSecondaryCategory() {
        return secondaryCategory;
    }

    public void setSecondaryCategory(String secondaryCategory) {
        this.secondaryCategory = secondaryCategory;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPackage() {
        return _package;
    }

    public void setPackage(String _package) {
        this._package = _package;
    }

    public String getPackageUnitType() {
        return packageUnitType;
    }

    public void setPackageUnitType(String packageUnitType) {
        this.packageUnitType = packageUnitType;
    }

    public Integer getPackageUnitVolumeInMilliliters() {
        return packageUnitVolumeInMilliliters;
    }

    public void setPackageUnitVolumeInMilliliters(Integer packageUnitVolumeInMilliliters) {
        this.packageUnitVolumeInMilliliters = packageUnitVolumeInMilliliters;
    }

    public Integer getTotalPackageUnits() {
        return totalPackageUnits;
    }

    public void setTotalPackageUnits(Integer totalPackageUnits) {
        this.totalPackageUnits = totalPackageUnits;
    }

    public Integer getVolumeInMilliliters() {
        return volumeInMilliliters;
    }

    public void setVolumeInMilliliters(Integer volumeInMilliliters) {
        this.volumeInMilliliters = volumeInMilliliters;
    }

    public Integer getAlcoholContent() {
        return alcoholContent;
    }

    public void setAlcoholContent(Integer alcoholContent) {
        this.alcoholContent = alcoholContent;
    }

    public Integer getPricePerLiterOfAlcoholInCents() {
        return pricePerLiterOfAlcoholInCents;
    }

    public void setPricePerLiterOfAlcoholInCents(Integer pricePerLiterOfAlcoholInCents) {
        this.pricePerLiterOfAlcoholInCents = pricePerLiterOfAlcoholInCents;
    }

    public Integer getPricePerLiterInCents() {
        return pricePerLiterInCents;
    }

    public void setPricePerLiterInCents(Integer pricePerLiterInCents) {
        this.pricePerLiterInCents = pricePerLiterInCents;
    }

    public Integer getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(Integer inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public Integer getInventoryVolumeInMilliliters() {
        return inventoryVolumeInMilliliters;
    }

    public void setInventoryVolumeInMilliliters(Integer inventoryVolumeInMilliliters) {
        this.inventoryVolumeInMilliliters = inventoryVolumeInMilliliters;
    }

    public Integer getInventoryPriceInCents() {
        return inventoryPriceInCents;
    }

    public void setInventoryPriceInCents(Integer inventoryPriceInCents) {
        this.inventoryPriceInCents = inventoryPriceInCents;
    }

    public Object getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(Object sugarContent) {
        this.sugarContent = sugarContent;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public Object getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(Object releasedOn) {
        this.releasedOn = releasedOn;
    }

    public Boolean getHasValueAddedPromotion() {
        return hasValueAddedPromotion;
    }

    public void setHasValueAddedPromotion(Boolean hasValueAddedPromotion) {
        this.hasValueAddedPromotion = hasValueAddedPromotion;
    }

    public Boolean getHasLimitedTimeOffer() {
        return hasLimitedTimeOffer;
    }

    public void setHasLimitedTimeOffer(Boolean hasLimitedTimeOffer) {
        this.hasLimitedTimeOffer = hasLimitedTimeOffer;
    }

    public Boolean getHasBonusRewardMiles() {
        return hasBonusRewardMiles;
    }

    public void setHasBonusRewardMiles(Boolean hasBonusRewardMiles) {
        this.hasBonusRewardMiles = hasBonusRewardMiles;
    }

    public Boolean getIsSeasonal() {
        return isSeasonal;
    }

    public void setIsSeasonal(Boolean isSeasonal) {
        this.isSeasonal = isSeasonal;
    }

    public Boolean getIsVqa() {
        return isVqa;
    }

    public void setIsVqa(Boolean isVqa) {
        this.isVqa = isVqa;
    }

    public Boolean getIsOcb() {
        return isOcb;
    }

    public void setIsOcb(Boolean isOcb) {
        this.isOcb = isOcb;
    }

    public Boolean getIsKosher() {
        return isKosher;
    }

    public void setIsKosher(Boolean isKosher) {
        this.isKosher = isKosher;
    }

    public Object getValueAddedPromotionDescription() {
        return valueAddedPromotionDescription;
    }

    public void setValueAddedPromotionDescription(Object valueAddedPromotionDescription) {
        this.valueAddedPromotionDescription = valueAddedPromotionDescription;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getServingSuggestion() {
        return servingSuggestion;
    }

    public void setServingSuggestion(Object servingSuggestion) {
        this.servingSuggestion = servingSuggestion;
    }

    public Object getTastingNote() {
        return tastingNote;
    }

    public void setTastingNote(Object tastingNote) {
        this.tastingNote = tastingNote;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getImageThumbUrl() {
        return imageThumbUrl;
    }

    public void setImageThumbUrl(String imageThumbUrl) {
        this.imageThumbUrl = imageThumbUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVarietal() {
        return varietal;
    }

    public void setVarietal(String varietal) {
        this.varietal = varietal;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getTertiaryCategory() {
        return tertiaryCategory;
    }

    public void setTertiaryCategory(String tertiaryCategory) {
        this.tertiaryCategory = tertiaryCategory;
    }

    public Object getSugarInGramsPerLiter() {
        return sugarInGramsPerLiter;
    }

    public void setSugarInGramsPerLiter(Object sugarInGramsPerLiter) {
        this.sugarInGramsPerLiter = sugarInGramsPerLiter;
    }

    public Integer getClearanceSaleSavingsInCents() {
        return clearanceSaleSavingsInCents;
    }

    public void setClearanceSaleSavingsInCents(Integer clearanceSaleSavingsInCents) {
        this.clearanceSaleSavingsInCents = clearanceSaleSavingsInCents;
    }

    public Boolean getHasClearanceSale() {
        return hasClearanceSale;
    }

    public void setHasClearanceSale(Boolean hasClearanceSale) {
        this.hasClearanceSale = hasClearanceSale;
    }

    public Integer getProductNo() {
        return productNo;
    }

    public void setProductNo(Integer productNo) {
        this.productNo = productNo;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(isDead);
        dest.writeValue(name);
        dest.writeValue(tags);
        dest.writeValue(isDiscontinued);
        dest.writeValue(priceInCents);
        dest.writeValue(regularPriceInCents);
        dest.writeValue(limitedTimeOfferSavingsInCents);
        dest.writeValue(limitedTimeOfferEndsOn);
        dest.writeValue(bonusRewardMiles);
        dest.writeValue(bonusRewardMilesEndsOn);
        dest.writeValue(stockType);
        dest.writeValue(primaryCategory);
        dest.writeValue(secondaryCategory);
        dest.writeValue(origin);
        dest.writeValue(_package);
        dest.writeValue(packageUnitType);
        dest.writeValue(packageUnitVolumeInMilliliters);
        dest.writeValue(totalPackageUnits);
        dest.writeValue(volumeInMilliliters);
        dest.writeValue(alcoholContent);
        dest.writeValue(pricePerLiterOfAlcoholInCents);
        dest.writeValue(pricePerLiterInCents);
        dest.writeValue(inventoryCount);
        dest.writeValue(inventoryVolumeInMilliliters);
        dest.writeValue(inventoryPriceInCents);
        dest.writeValue(sugarContent);
        dest.writeValue(producerName);
        dest.writeValue(releasedOn);
        dest.writeValue(hasValueAddedPromotion);
        dest.writeValue(hasLimitedTimeOffer);
        dest.writeValue(hasBonusRewardMiles);
        dest.writeValue(isSeasonal);
        dest.writeValue(isVqa);
        dest.writeValue(isOcb);
        dest.writeValue(isKosher);
        dest.writeValue(valueAddedPromotionDescription);
        dest.writeValue(description);
        dest.writeValue(servingSuggestion);
        dest.writeValue(tastingNote);
        dest.writeValue(updatedAt);
        dest.writeValue(imageThumbUrl);
        dest.writeValue(imageUrl);
        dest.writeValue(varietal);
        dest.writeValue(style);
        dest.writeValue(tertiaryCategory);
        dest.writeValue(sugarInGramsPerLiter);
        dest.writeValue(clearanceSaleSavingsInCents);
        dest.writeValue(hasClearanceSale);
        dest.writeValue(productNo);
    }

    public int describeContents() {
        return  0;
    }

}
