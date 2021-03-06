package gov.acwi.wqp.etl.stewards.result;

import org.apache.commons.lang3.StringUtils;
import org.springframework.batch.item.ItemProcessor;

import gov.acwi.wqp.etl.stewards.wqx.WqxActivity;
import gov.acwi.wqp.etl.stewards.wqx.WqxActivityDescription;

public class ArsResultProcessor implements ItemProcessor<WqxActivity, ArsResult> {

	@Override
	public ArsResult process(WqxActivity wqxActivity) throws Exception {
		ArsResult arsResult = new ArsResult();
		if (null != wqxActivity.getActivityDescription()) {
			WqxActivityDescription activityDescription = wqxActivity.getActivityDescription();
			arsResult.setActivityIdentifier(StringUtils.trimToNull(activityDescription.getActivityIdentifier()));
			arsResult.setActivityTypeCode(StringUtils.trimToNull(activityDescription.getActivityTypeCode()));
			arsResult.setActivityMediaName(StringUtils.trimToNull(activityDescription.getActivityMediaName()));
			arsResult.setActivityStartDate(StringUtils.trimToNull(activityDescription.getActivityStartDate()));
			if (null != activityDescription.getActivityStartTime()) {
				arsResult.setActivityStartTime(StringUtils.trimToNull(activityDescription.getActivityStartTime().getTime()));
				arsResult.setActivityStartTimeZoneCode(StringUtils.trimToNull(activityDescription.getActivityStartTime().getTimeZoneCode()));
			}
			arsResult.setProjectIdentifier(StringUtils.trimToNull(activityDescription.getProjectIdentifier()));
			arsResult.setMonitoringLocationIdentifier(StringUtils.trimToNull(activityDescription.getMonitoringLocationIdentifier()));
			arsResult.setActivityCommentText(StringUtils.trimToNull(activityDescription.getActivityCommentText()));
		}
		if (null != wqxActivity.getSampleDescription()) {
			if (null != wqxActivity.getSampleDescription().getSampleCollectionMethod()) {
				arsResult.setSampleCollectionMethodIdentifier(StringUtils.trimToNull(wqxActivity.getSampleDescription().getSampleCollectionMethod().getMethodIdentifier()));
				arsResult.setSampleCollectionMethodIdentifierContext(StringUtils.trimToNull(wqxActivity.getSampleDescription().getSampleCollectionMethod().getMethodIdentifierContext()));
				arsResult.setSampleCollectionMethodName(StringUtils.trimToNull(wqxActivity.getSampleDescription().getSampleCollectionMethod().getMethodName()));
				arsResult.setSampleCollectionMethodDescriptionText(StringUtils.trimToNull(wqxActivity.getSampleDescription().getSampleCollectionMethod().getMethodDescriptionText()));
			}
			arsResult.setSampleCollectionEquipmentName(StringUtils.trimToNull(wqxActivity.getSampleDescription().getSampleCollectionEquipmentName()));
			arsResult.setSampleCollectionEquipmentCommentText(StringUtils.trimToNull(wqxActivity.getSampleDescription().getSampleCollectionEquipmentCommentText()));
		}
		if (null != wqxActivity.getResult()) {
			if (null != wqxActivity.getResult().getResultDescription()) {
				arsResult.setResultDetectionConditionText(StringUtils.trimToNull(wqxActivity.getResult().getResultDescription().getResultDetectionConditionText()));
				arsResult.setCharacteristicName(StringUtils.trimToNull(wqxActivity.getResult().getResultDescription().getCharacteristicName()));
				arsResult.setResultSampleFractionText(StringUtils.trimToNull(wqxActivity.getResult().getResultDescription().getResultSampleFractionText()));
				if (null != wqxActivity.getResult().getResultDescription().getResultMeasure()) {
					arsResult.setResultMeasureValue(StringUtils.trimToNull(wqxActivity.getResult().getResultDescription().getResultMeasure().getResultMeasureValue()));
					arsResult.setResultMeasureUnitCode(StringUtils.trimToNull(wqxActivity.getResult().getResultDescription().getResultMeasure().getMeasureUnitCode()));
				}
				arsResult.setResultStatusIdentifier(StringUtils.trimToNull(wqxActivity.getResult().getResultDescription().getResultStatusIdentifier()));
				arsResult.setResultValueTypeName(StringUtils.trimToNull(wqxActivity.getResult().getResultDescription().getResultValueTypeName()));
				if (null != wqxActivity.getResult().getResultDescription().getDataQuality()) {
					arsResult.setDataQualityPrecisionValue(StringUtils.trimToNull(wqxActivity.getResult().getResultDescription().getDataQuality().getPrecisionValue()));
				}
				arsResult.setResultCommentText(StringUtils.trimToNull(wqxActivity.getResult().getResultDescription().getResultCommentText()));
			}
			if (null != wqxActivity.getResult().getResultAnalyticalMethod()) {
				arsResult.setResultAnalyticalMethodIdentifier(StringUtils.trimToNull(wqxActivity.getResult().getResultAnalyticalMethod().getMethodIdentifier()));
				arsResult.setResultAnalyticalMethodIdentifierContext(StringUtils.trimToNull(wqxActivity.getResult().getResultAnalyticalMethod().getMethodIdentifierContext()));
				arsResult.setResultAnalyticalMethodName(StringUtils.trimToNull(wqxActivity.getResult().getResultAnalyticalMethod().getMethodName()));
				arsResult.setResultAnalyticalMethodDescriptionText(StringUtils.trimToNull(wqxActivity.getResult().getResultAnalyticalMethod().getMethodDescriptionText()));
			}
			if (null != wqxActivity.getResult().getResultLabInformation()
					&& null != wqxActivity.getResult().getResultLabInformation().getResultDetectionQuantitationLimit()) {
				arsResult.setDetectionQuantitationLimitTypeName(StringUtils.trimToNull(wqxActivity.getResult().getResultLabInformation().getResultDetectionQuantitationLimit().getDetectionQuantitationLimitTypeName()));
				if (null != wqxActivity.getResult().getResultLabInformation().getResultDetectionQuantitationLimit().getDetectionQuantitationLimitMeasure()) {
					arsResult.setDetectionQuantitationLimitMeasureValue(StringUtils.trimToNull(wqxActivity.getResult().getResultLabInformation().getResultDetectionQuantitationLimit().getDetectionQuantitationLimitMeasure().getMeasureValue()));
					arsResult.setDetectionQuantitationLimitMeasureUnitCode(StringUtils.trimToNull(wqxActivity.getResult().getResultLabInformation().getResultDetectionQuantitationLimit().getDetectionQuantitationLimitMeasure().getMeasureUnitCode()));
				}
			}
		}
		return arsResult;
	}
}
