import au.com.langdale.soapbox.Publisher._
import sbt._
import scala.xml._

object Templates extends Plugin {
  override def projectSettings = Seq(
    siteTemplates += Template("*.md",
      (title, content) => {
        <html>
          <head><title>{title}</title></head>
          <body>{content}</body>
        </html>
      }
    )
  )
}