import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Frame as Frame
import javax.swing.JOptionPane as JOptionPane
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.aulaplaneta.com/')

WebUI.setText(findTestObject('Object Repository/Page_aulaPlaneta/input_Nombre_form-control ng-untouched ng-d_b6159e'), 'Profesor_estres_1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_aulaPlaneta/input_Contrasea_form-control ng-untouched n_eceae4'), 
    'aSjXa3TkIdaC2ltQJ6F5Vw==')

WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_Entrar'))

WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/mat-icon_search'))

WebUI.setText(findTestObject('Page_Mis materias - aulaPlaneta/input_Bsqueda_mat-input-0'), 'agua')

WebUI.click(findTestObject('Object Repository/Page_Mis materias - aulaPlaneta/span_El ciclo del agua'))

WebUI.click(findTestObject('Page_Mis materias - aulaPlaneta/div_buttonRoundButton_Esquemadelcilcodelagua'))

'Verifica si esta el requadre del video'
EsquemaSuccessFul = WebUI.verifyElementVisible(findTestObject('Page_Mis materias - aulaPlaneta/img_30_Esquema'))

WebUI.click(findTestObject('Page_Mis materias - aulaPlaneta/div_buttonRoundButton_verciclodelagua'))

VerCicloCSuccessFul = WebUI.waitForElementVisible(findTestObject('Page_Mis materias - aulaPlaneta/img_30_VerCicloAgua_condensacion'), 
    0)

VerCicloESuccessFul = WebUI.waitForElementVisible(findTestObject('Page_Mis materias - aulaPlaneta/img_30_VerCicloAgua_precipitacion'), 
    0)

VerCicloPSuccessFul = WebUI.waitForElementVisible(findTestObject('Page_Mis materias - aulaPlaneta/img_30_VerCicloAgua_evaporacion'), 
    0)

VerCicloFSuccessFul = WebUI.waitForElementVisible(findTestObject('Page_Mis materias - aulaPlaneta/img_30_VerCicloAgua_filtracion'), 
    0)

switch (true) {
    case VerCicloCSuccessFul:
        'Verifica si esta el requadre del video'
        WebUI.verifyElementVisible(findTestObject('Page_Mis materias - aulaPlaneta/img_30_VerCicloAgua_condensacion'))

        break
    case VerCicloESuccessFul:
        'Verifica si esta el requadre del video'
        WebUI.verifyElementVisible(findTestObject('Page_Mis materias - aulaPlaneta/img_30_VerCicloAgua_evaporacion'))

        break
    case VerCicloPSuccessFul:
        'Verifica si esta el requadre del video'
        WebUI.verifyElementVisible(findTestObject('Page_Mis materias - aulaPlaneta/img_30_VerCicloAgua_precipitacion'))

        break
    default:
        'Verifica si esta el requadre del video'
        WebUI.verifyElementVisible(findTestObject('Page_Mis materias - aulaPlaneta/img_30_VerCicloAgua_filtracion'))

        break
}

WebUI.closeBrowser()

