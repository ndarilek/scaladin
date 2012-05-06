package vaadin

package object scala {

  implicit def intToMeasureOption(value: Int): MeasureExtent = new MeasureExtent(value)

  implicit def doubleToMeasureOption(value: Double): MeasureExtent = new MeasureExtent(value)

  implicit def fullSizeToUnitExtend(value: Size): Tuple2[String, String] = value.toSizes

  // Button
  implicit def byNameParameterToButtonClickEventListener(action: => Unit): ButtonClickEvent => Unit = (e: ButtonClickEvent) => action

  // Upload
  //  implicit def byNameParameterToUploadReceiver(action: => Unit): Upload.ReceiveEvent => Unit = (e: Upload.ReceiveEvent) => action
  //  implicit def byNameParameterToUploadProgressListener(action: => Unit): Upload.ProgressEvent => Unit = (e: Upload.ProgressEvent) => action
  //  implicit def byNameParameterToUploadStartedListener(action: => Unit): Upload.StartedEvent => Unit = (e: Upload.StartedEvent) => action
  //  implicit def byNameParameterToUploadFinishedListener(action: => Unit): Upload.FinishedEvent => Unit = (e: Upload.FinishedEvent) => action
  //  implicit def byNameParameterToUploadFailedListener(action: => Unit): Upload.FailedEvent => Unit = (e: Upload.FailedEvent) => action
  //  implicit def byNameParameterToUploadSucceededListener(action: => Unit): Upload.SucceededEvent => Unit = (e: Upload.SucceededEvent) => action
}