//
//  ViewController.swift
//  05_UserDefaults
//
//  Created by Marta Almeida on 29/01/2024.
//

import UIKit

class ViewController: UIViewController {

    
    @IBOutlet weak var editUsername: UITextField!
    
    @IBOutlet weak var textResult: UILabel!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
    }


    @IBAction func buttonSaveClicked(_ sender: Any) {
        let username = editUsername.text ?? ""
        
        textResult.text = "Username : \(username)"
        
        UserDefaults.standard.set(username,forKey:"savedUsername")
    }
    
    
    @IBAction func buttonDeleteClicked(_ sender: Any) {
        textResult.text = "Empty"
        
        let storedUsername = UserDefaults.standard.object(forKey: "savedUsername")
        
        if storedUsername as? String != nil{
            UserDefaults.standard.removeObject(forKey: "savedUsername")
        }
    }
    
    @IBAction func buttonCheckClicked(_ sender: Any) {
        let storedUsername = UserDefaults.standard.object(forKey: "savedUsername")
        
        if let username = storedUsername as? String {
            textResult.text = "Saved: \(username)"
        } else {
            textResult.text = "No Value"
        }
    }
    
}

