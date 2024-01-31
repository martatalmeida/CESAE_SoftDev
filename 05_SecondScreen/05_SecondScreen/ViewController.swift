//
//  ViewController.swift
//  05_SecondScreen
//
//  Created by Marta Almeida on 31/01/2024.
//

import UIKit

class ViewController: UIViewController {
    
    
   
    @IBOutlet weak var usernameText: UITextField!
    
    @IBOutlet weak var passText: UITextField!
    
    
    @IBOutlet weak var validarText: UILabel!
   
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


    @IBAction func goToButton(_ sender: Any) {
    
        let username = usernameText.text ?? ""
        let pass = passText.text ?? ""
        
        if (username == "user" && pass == "pass") {
            
        } else {
            let alert = UIAlertController(title: "Alert", message: "Invalid Login", preferredStyle: UIAlertController.Style.alert)
            alert.addAction(UIAlertAction(title: "Ok", style: UIAlertAction.Style.default, handler: nil))
            self.present(alert, animated: true, completion: nil)
        }
        
        
    }
}

