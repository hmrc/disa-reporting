/*
 * Copyright 2026 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.disareporting.config

import org.scalatest.matchers.must.Matchers.mustBe
import play.api.Configuration
import uk.gov.hmrc.disareporting.utils.BaseSpec

class AppConfigSpec extends BaseSpec {
  private val configMap: Map[String, Any] = Map(
    "appName" -> "disa-reporting"
  )

  private val configuration = Configuration.from(configMap)
  private val appConfig     = new AppConfig(configuration)

  "AppConfig" should {

    "read the right name" in {
      appConfig.appName mustBe "disa-reporting"
    }
  }
}
