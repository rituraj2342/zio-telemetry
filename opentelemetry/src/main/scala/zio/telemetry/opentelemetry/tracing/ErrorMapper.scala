package zio.telemetry.opentelemetry.tracing

import io.opentelemetry.api.trace.StatusCode

case class ErrorMapper[E](body: PartialFunction[E, StatusCode])

object ErrorMapper {

  def default[E]: ErrorMapper[E] =
    ErrorMapper[E](Map.empty)

}
